SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libblkid-devel-static-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "7b931eaf06f317801e6c9e44d17b3ed5dbc5eb2dc1fdab514aa3d6c269c9a4668bbcef7f9cb5b62c208299b5bc0c6385a8716931605ef9d30bc32c80662190a6"

RPROVIDES:${PN} += "libblkid-devel-static"

RDEPENDS:${PN} += "libblkid-devel"

inherit rpm
