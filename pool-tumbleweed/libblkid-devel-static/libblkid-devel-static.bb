SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libblkid-devel-static-2.39-2.1.aarch64.rpm"
RPM_HASH = "6ed9a229e973f29516ccf586786f0d9d6904a4a1c3cc53549040695c40af9cd2a21ac659b025bfdef1571af71805b09b4ad7ed26504408f41c84f254b21b98cf"

RPROVIDES:${PN} += "libblkid-devel-static"

RDEPENDS:${PN} += "libblkid-devel"

inherit rpm
