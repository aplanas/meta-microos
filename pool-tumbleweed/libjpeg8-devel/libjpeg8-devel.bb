SUMMARY = "Development Tools for applications which will use the Libjpeg Library"
DESCRIPTION = "The libjpeg-devel package includes the header files and libraries \
necessary for compiling and linking programs which will manipulate JPEG \
files using the libjpeg library."
LICENSE = "BSD-3-Clause"

PV = "8.2.2"

RPM_NAME = "libjpeg8-devel-8.2.2-75.1.aarch64.rpm"
RPM_HASH = "72fe89a24b8df8d3d4cd4a9df020d1926bd04b752433e6197f896a30dbc1eabef49e46f545a47cb5688eacc70238de9fd211fd0af1a8a9ef4f2d747ddb7a6c87"

RPROVIDES:${PN} += "cmake(libjpeg-turbo) \
libjpeg-devel \
libjpeg8-devel \
libjpeg8-devel(aarch-64) \
pkgconfig(libjpeg) \
pkgconfig(libturbojpeg)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg8 \
libturbojpeg0"

inherit rpm
