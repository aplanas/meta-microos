SUMMARY = "Deepin Polkit Agent"
DESCRIPTION = "DDE Polkit Agent is the polkit agent used in Deepin Desktop Environment."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.21"

RPM_NAME = "deepin-polkit-agent-5.5.21-1.3.aarch64.rpm"
RPM_HASH = "bf50ee727e3e408cef2f2ca0dd127c32147586a9c01e20c7537a3d2303a407d12304e7f775356475585db156f5ffdb529e772448c83045fd7b4b9301f6cc6f9c"

RPROVIDES:${PN} += "deepin-polkit-agent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libpolkit-qt5-agent-1.so.1 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
