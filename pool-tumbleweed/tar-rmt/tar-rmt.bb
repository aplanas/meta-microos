SUMMARY = "Remote tape drive control server by GNU"
DESCRIPTION = "Provides remote access to files and devices for tar, cpio \
and similar backup utilities"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-rmt-1.34-10.4.aarch64.rpm"
RPM_HASH = "058ed2477db3827275950dc69b3296ca40e44d58b63c056d398039d76703819d86de4956e8a3cc04db70dfab0012c41b868e90fa25eeb91adc38ae82d0cc64d1"

RPROVIDES:${PN} += "rmt \
tar-rmt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
