SUMMARY = "KDE's screen management library (development package)"
DESCRIPTION = "Development files belonging to libkscreen, dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libkscreen2-devel-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "805ac49382b722bce0dac62e709889da3042a5bc6226827cd41a340c108cf8bd93fea21c0c730f257505f6d0e727f4bcbc9d8052ab70e0e4ae507124fff507ba"

RPROVIDES:${PN} += "cmake(KF5Screen) \
libkscreen2-devel \
libkscreen2-devel(aarch-64) \
pkgconfig(kscreen2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt5Core) \
libKF5Screen8 \
libKF5ScreenDpms8"

inherit rpm
