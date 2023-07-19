SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libfdisk-devel-static-2.39-3.1.aarch64.rpm"
RPM_HASH = "7f106c7467dc4c70a661e5249e10b67a77836d7b0c2500e70528ecf8029b7111db6eefeced7b68a1c4e331bf1643ac06f47bf8d490c4e63b1315f8134273497d"

RPROVIDES:${PN} += "libfdisk-devel-static"

RDEPENDS:${PN} += "libfdisk-devel"

inherit rpm
