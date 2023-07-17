SUMMARY = "Development files for the Qt 6 WebEngineCore library"
DESCRIPTION = "Development files for the Qt 6 WebEngineCore library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginecore-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c576374212aa4fa2aaf67b0bc7d90e384b88ac79e167855c4d32b959008cb1f0660e3284b93e7ab8a66da642daf01960cbe5a11caebde598ac524083248bf598"

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
