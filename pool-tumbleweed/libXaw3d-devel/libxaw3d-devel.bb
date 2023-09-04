SUMMARY = "Development files for the X Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images. \
 \
This package contains the development headers for the library found \
in libXaw3d6/libXaw3d7/libXaw3d8."
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "libXaw3d-devel-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "5b2277bb501c444e51e7f35ccb67407ed540b43c67737156d37eec917cc95bbebfac20d9863ff608a9a17d37b31fa1924d1b52d6810a810ab5511c5a6743e7ac"

RPROVIDES:${PN} += "libXaw3d-devel \
pkgconfig-xaw3d \
xaw3d-/usr/include/X11/Xaw3d/Xaw3dP.h \
xaw3d-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXaw3d6 \
libXaw3d7 \
libXaw3d8 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xmu \
pkgconfig-xproto \
pkgconfig-xt"

inherit rpm
