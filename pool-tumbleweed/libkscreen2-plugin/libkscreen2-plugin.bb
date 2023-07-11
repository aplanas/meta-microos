SUMMARY = "KDE's screen management library"
DESCRIPTION = "Plugins for dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libkscreen2-plugin-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "ec85b44454f661c64ed88e546261c8948c5a506dda441515d00cf78b411e5a7c8459eb5c37523fa31428ac5a1062915d1c5292f2c3c4bf87df155d7b11e00003"

RPROVIDES:${PN} += "libkscreen2-plugin \
libkscreen2-zsh-completion"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5Screen.so.8 \
libKF5Screen8 \
libKF5ScreenDpms.so.8 \
libKF5ScreenDpms8 \
libKF5WaylandClient.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-randr.so.0 \
libxcb.so.1"

inherit rpm
