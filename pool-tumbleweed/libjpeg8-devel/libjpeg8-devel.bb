SUMMARY = "Development Tools for applications which will use the Libjpeg Library"
DESCRIPTION = "The libjpeg-devel package includes the header files and libraries \
necessary for compiling and linking programs which will manipulate JPEG \
files using the libjpeg library."
LICENSE = "BSD-3-Clause"

PV = "8.2.2"

RPM_NAME = "libjpeg8-devel-8.2.2-76.1.aarch64.rpm"
RPM_HASH = "d6973577d3941bbcc605ee243d4d15dec195f2fc063ee645e1c84f9f7f3b06817ad0497a9e69fa254893f59b38b7347a7f271035289f3e5333005ba768676a10"

RPROVIDES:${PN} += "cmake-libjpeg-turbo \
libjpeg-devel \
libjpeg8-devel \
pkgconfig-libjpeg \
pkgconfig-libturbojpeg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg8 \
libturbojpeg0"

inherit rpm
