SUMMARY = "Include headers and Qt Designer plugin for Qwt"
DESCRIPTION = "This package contains the header files of Qwt and its Qt designer plugin \
in order to create Qt applications using the Qwt widgets."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "qwt-devel-5.2.3_qt5+git20181129.2819734-3.19.aarch64.rpm"
RPM_HASH = "b14f1680f7e76b1bd28a66bcc6daeb3c705272fc785d5c602b4d1140194ae6cd7bd17499e8e732689174bf4400fa29e39e38ff65432a0a9f93a436e13a8fa971"

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
