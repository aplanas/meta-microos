SUMMARY = "A calendar application for Deepin Desktop"
DESCRIPTION = "Draw is a lightweight drawing tool for users to freely draw and simply edit \
images developed by Deepin Technology."
LICENSE = "GPL-3.0-or-later"

PV = "5.11.4"

RPM_NAME = "deepin-draw-5.11.4-1.3.aarch64.rpm"
RPM_HASH = "132c6dcbb498a9f680fbf840decd19db11537cff2eb1b567d92487e19636f21d2dc451cca443156aa4043ed0069bc538f61ee80cc49992dc6403de51f44880ff"

RPROVIDES:${PN} += "deepin-draw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
