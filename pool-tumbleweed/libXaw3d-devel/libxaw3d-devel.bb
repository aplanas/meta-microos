SUMMARY = "Development files for the X Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images. \
 \
This package contains the development headers for the library found \
in libXaw3d6/libXaw3d7/libXaw3d8."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "libXaw3d-devel-1.6.4-1.3.aarch64.rpm"
RPM_HASH = "4462e2eb8c7bed41d9867be638edf18418eddaaed70650f72365dcc6d4294460cb9155dfbaa643a419f127b60b3a6bd69a11290a5b0fe34562e59362a834c48b"

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
