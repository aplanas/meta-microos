SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libblkid-devel-static-2.39-1.1.aarch64.rpm"
RPM_HASH = "181fa5aa52caa8243ecb63cfaf71cf0ebca02e1a6a6a26d712987dc79684fd94da8e9543cab24bb3043e98cf21c61dfd54ff53dec0aeca9906e3f5434c7510a9"

RPROVIDES:${PN} += "libblkid-devel-static"

RDEPENDS:${PN} += "libblkid-devel"

inherit rpm
