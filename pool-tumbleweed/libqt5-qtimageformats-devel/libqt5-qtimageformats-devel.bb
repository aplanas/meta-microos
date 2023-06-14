SUMMARY = "Qt Development Kit"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains qtimageformats. \
 \
You need this package, if you want to compile programs with qtimageformats."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde9"

RPM_NAME = "libqt5-qtimageformats-devel-5.15.9+kde9-1.1.aarch64.rpm"
RPM_HASH = "a289eaa4c940d86b1b9985d71a7d7eff5bac9a73b45a5bdc4d14d540a39d50e38c42d02cf5da1c670826813a903a25f8c7656c563120730cedcd6bf699fa05af"

RPROVIDES:${PN} += "libqt5-qtimageformats-devel"

RDEPENDS:${PN} += "libmng-devel \
libqt5-qtimageformats \
libtiff-devel \
pkgconfig-Qt5Gui \
pkgconfig-libwebp"

inherit rpm
