SUMMARY = "Include headers and Qt Designer plugin for Qwt(Qt5)"
DESCRIPTION = "This package contains the header files of Qwt and its Qt designer plugin \
in order to create Qt applications using the Qwt(Qt6) widgets."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "qwt6-qt6-devel-6.2.0-2.2.aarch64.rpm"
RPM_HASH = "8a8b557271627d98791599fab606cf77be4415fd502fefd040215cb7136427f735bce6253f25382b3a4f25fdc846c02eda29438aabbc014e09d9cada965a2bf5"

RPROVIDES:${PN} += "pkgconfig-Qt6Qwt6 \
qwt6-qt6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
freetype2-devel \
gcc-c++ \
libqwt6-qt6-6-2 \
pkgconfig-Qt6Concurrent \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6PrintSupport \
pkgconfig-Qt6Svg \
pkgconfig-Qt6Widgets \
pkgconfig-libpng"

inherit rpm
