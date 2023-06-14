SUMMARY = "The screen recorder plugin of deepin dock"
DESCRIPTION = "The deepin screen recorder plugin of deepin dock"
LICENSE = "GPL-3.0-or-later"

PV = "5.11.6"

RPM_NAME = "deepin-dock-plugin-screen-recorder-5.11.6-1.7.aarch64.rpm"
RPM_HASH = "d937679676f1ce26a60e3e52fa51d07c7863efe82a7fb802fa5f00c1d929c9623710413dfbe22dd5624735d880e36c5e8bccc41f44fbd4e047d3b3c492e5fd3c"

RPROVIDES:${PN} += "deepin-dock-plugin-screen-recorder \
libdeepin-screen-recorder-plugin.so"

RDEPENDS:${PN} += "deepin-dock \
deepin-screen-recorder \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdframeworkdbus.so.2 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
