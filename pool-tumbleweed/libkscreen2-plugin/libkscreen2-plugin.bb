SUMMARY = "KDE's screen management library"
DESCRIPTION = "Plugins for dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libkscreen2-plugin-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "d5afdffd8e31470de75e8aaeae35d92b5cee9df22dd04e2079c1a3f5e7d910de6a0ebce294d6058af8845818ec91d2dfbb78d087fa66a71c634bd78f095ff9ef"

RPROVIDES:${PN} += "libkscreen2-plugin \
libkscreen2-plugin(aarch-64) \
libkscreen2-zsh-completion"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5Screen.so.8()(64bit) \
libKF5Screen8 \
libKF5ScreenDpms.so.8()(64bit) \
libKF5ScreenDpms8 \
libKF5WaylandClient.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
