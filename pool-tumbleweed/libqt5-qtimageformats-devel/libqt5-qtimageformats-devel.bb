SUMMARY = "Qt Development Kit"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains qtimageformats. \
 \
You need this package, if you want to compile programs with qtimageformats."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde9"

RPM_NAME = "libqt5-qtimageformats-devel-5.15.10+kde9-1.1.aarch64.rpm"
RPM_HASH = "886f08534f5f0e8bc6f6bcd40eefed36033a69c69c39ffbbb93546ccbd003787446984f1f64182d969c4e25a582835b1ef0d1491aa1eecee11b01f37e6252b0a"

RPROVIDES:${PN} += "libqt5-qtimageformats-devel"

RDEPENDS:${PN} += "libmng-devel \
libqt5-qtimageformats \
libtiff-devel \
pkgconfig-Qt5Gui \
pkgconfig-libwebp"

inherit rpm
