SUMMARY = "A calendar application for Deepin Desktop"
DESCRIPTION = "The deepin-calendar is a calendar for Deepin Desktop Environment."
LICENSE = "GPL-3.0-or-later"

PV = "5.8.30"

RPM_NAME = "deepin-calendar-5.8.30-1.3.aarch64.rpm"
RPM_HASH = "63fb90a0dd7c5f2407ad89d0749fdfca8e2a12ed6ac9e573386c27991aba9e643c2aae691663c83492b1e3fd8813c1a762b5a3884ebb5034b64c8f0905840ef1"

RPROVIDES:${PN} += "deepin-calendar \
libuosschedulex-plugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
