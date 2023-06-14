SUMMARY = "KDE's screen management library"
DESCRIPTION = "Plugins for dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libkscreen2-plugin-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "d5afdffd8e31470de75e8aaeae35d92b5cee9df22dd04e2079c1a3f5e7d910de6a0ebce294d6058af8845818ec91d2dfbb78d087fa66a71c634bd78f095ff9ef"

RPROVIDES:${PN} += "libkscreen2-plugin \
libkscreen2-zsh-completion"

RDEPENDS:${PN} += "/bin/sh \
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
