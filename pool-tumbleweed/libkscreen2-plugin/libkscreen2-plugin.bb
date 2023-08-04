SUMMARY = "KDE's screen management library"
DESCRIPTION = "Plugins for dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libkscreen2-plugin-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "33941eae6b841ee4633c22813512cd03809f52b82e150e42fcb637aaa8f9d9c8f4f250775e89cf92ab05fee0947dcf6c6b5f38160cb07bfbb4d626234a5559a1"

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
