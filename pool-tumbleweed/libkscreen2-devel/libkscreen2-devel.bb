SUMMARY = "KDE's screen management library (development package)"
DESCRIPTION = "Development files belonging to libkscreen, dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libkscreen2-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "9f3e083362a987a1e2fd27a815c0c47941078ea1a51ef34a46bb4e38fe5ad6f144f108f12fdff40c9e912c8afd1f3daa8014d43fabb5ad7950c692de2145b20b"

RPROVIDES:${PN} += "cmake-KF5Screen \
libkscreen2-devel \
pkgconfig-kscreen2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
libKF5Screen8 \
libKF5ScreenDpms8"

inherit rpm
