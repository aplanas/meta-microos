SUMMARY = "Development files for the Qt 6 WebEngineCore library"
DESCRIPTION = "Development files for the Qt 6 WebEngineCore library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginecore-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "eb7448675606d3546bf416a65a31f40b452971b6aef40ecd1b6c5bf7812a046f4f1040019bb5027806116f1796b6be0a11072fa5729266438a012849ee6ac37e"

RPROVIDES:${PN} += "cmake-Qt6WebEngineCore \
cmake-Qt6WebEngineCoreTools \
pkgconfig-Qt6WebEngineCore \
qt6-webenginecore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6Positioning \
cmake-Qt6Quick \
cmake-Qt6WebChannel \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6WebEngineCore6 \
libc.so.6 \
libevent-2.1.so.7 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Network \
pkgconfig-Qt6Positioning \
pkgconfig-Qt6Quick \
pkgconfig-Qt6WebChannel"

inherit rpm
