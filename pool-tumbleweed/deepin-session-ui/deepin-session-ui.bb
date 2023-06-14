SUMMARY = "Deepin desktop-environment - Session UI module"
DESCRIPTION = "This project include those sub-project: \
 \
- deepin-lowpower: The user interface of reminding low power. \
- deepin-osd: User interface of on-screen display. \
- deepin-hotzone: User interface of setting hot zone."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.24"

RPM_NAME = "deepin-session-ui-5.5.24-1.3.aarch64.rpm"
RPM_HASH = "e687451a77d3b15e2a0178b92edf0ee43b903b63e6e49c908f20c677bdfac2c11fff9f4e825f1a2e281c525388e37f9899daeb5d12af626a2b9a30ae1748068e"

RPROVIDES:${PN} += "deepin-session-ui \
libnotifications.so"

RDEPENDS:${PN} += "deepin-wallpapers \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Test.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsettings-qt.so.1 \
libstdc++.so.6 \
libsystemd.so.0 \
libxcb-ewmh.so.2"

inherit rpm
