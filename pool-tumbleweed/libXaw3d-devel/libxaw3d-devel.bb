SUMMARY = "Development files for the X Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images. \
 \
This package contains the development headers for the library found \
in libXaw3d6/libXaw3d7/libXaw3d8."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "libXaw3d-devel-1.6.4-1.4.aarch64.rpm"
RPM_HASH = "fb21d8ddc360285932bdea05b37617b2f7b6c39bd24b33abc460720ae4a96d4db3bf9a7fd7f74906e3d825800b2cbcbccc405548d334102f21990fa7adbeb1ee"

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
