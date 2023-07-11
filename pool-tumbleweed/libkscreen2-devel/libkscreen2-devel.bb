SUMMARY = "KDE's screen management library (development package)"
DESCRIPTION = "Development files belonging to libkscreen, dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libkscreen2-devel-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "832cabd520e700815f170d8cc51ec5c142c4af9f4e278780270f64984f2c50c98d77cfa442797d1f0a60749891474b3c3954c9bc7440e5f24a45897d63553eeb"

RPROVIDES:${PN} += "cmake-KF5Screen \
libkscreen2-devel \
pkgconfig-kscreen2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
libKF5Screen8 \
libKF5ScreenDpms8"

inherit rpm
