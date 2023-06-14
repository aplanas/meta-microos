SUMMARY = "Include headers and Qt Designer plugin for Qwt"
DESCRIPTION = "This package contains the header files of Qwt and its Qt designer plugin \
in order to create Qt applications using the Qwt widgets."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "qwt-devel-5.2.3_qt5+git20181129.2819734-3.18.aarch64.rpm"
RPM_HASH = "16ce112782921da49bc61298509cbe0b355df16c733e11173346d3e4f72cc21de30b4de65f4669cfdc3a62108ad2840815c298c92ce48d78232064fcdfc1019c"

RPROVIDES:${PN} += "libqwt5-devel \
pkgconfig-qwt5-qt5 \
qwt \
qwt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
freetype2-devel \
gcc-c++ \
libpng-devel \
libqwt5-qt5-5 \
pkgconfig-Qt5Gui \
pkgconfig-Qt5PrintSupport \
pkgconfig-Qt5Svg \
pkgconfig-Qt5Widgets"

inherit rpm
