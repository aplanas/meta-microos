SUMMARY = "Parity Archive File Generator"
DESCRIPTION = "Parchive creates extra parity data over several volumes. These can be \
used to restore the complete archive after some data loss or \
corruption."
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "par-1.1-190.16.aarch64.rpm"
RPM_HASH = "5881187d2f90529c5d81fdbffec270fc7bf25065fe8a455573598f393e2c06aab03a9ef6cc3cecad166e48149a6428d12d943d850cbacb893e096924d6db993e"

RPROVIDES:${PN} += "par"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
