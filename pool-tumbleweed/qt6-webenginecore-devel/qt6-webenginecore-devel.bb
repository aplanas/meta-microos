SUMMARY = "Development files for the Qt 6 WebEngineCore library"
DESCRIPTION = "Development files for the Qt 6 WebEngineCore library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webenginecore-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "c627f2e7a15633151438208c85f7b71e001bd39c69f9a23ca1d3b05449596d228478aeba5ce1bd813cc3a34970bd7a45c43f92d1971846915c34a6177ac11b1a"

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
