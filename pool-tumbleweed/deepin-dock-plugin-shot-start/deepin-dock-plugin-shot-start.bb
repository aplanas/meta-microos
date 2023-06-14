SUMMARY = "The shot start plugin of deepin dock"
DESCRIPTION = "The shot start of deepin dock"
LICENSE = "GPL-3.0-or-later"

PV = "5.11.6"

RPM_NAME = "deepin-dock-plugin-shot-start-5.11.6-1.7.aarch64.rpm"
RPM_HASH = "a614fe1a9f0dee84c808024a49661de3981a272d2ef0af61721a6571d3de3a1947bc3895ee4672f9d4971b9a33199854fd1b3a78f4f6138c2a51f5b2c22c0f18"

RPROVIDES:${PN} += "deepin-dock-plugin-shot-start \
libshot-start-plugin.so"

RDEPENDS:${PN} += "deepin-dock \
deepin-screen-recorder \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
