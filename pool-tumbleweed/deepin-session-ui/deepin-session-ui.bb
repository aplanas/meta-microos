SUMMARY = "Deepin desktop-environment - Session UI module"
DESCRIPTION = "This project include those sub-project: \
 \
- deepin-lowpower: The user interface of reminding low power. \
- deepin-osd: User interface of on-screen display. \
- deepin-hotzone: User interface of setting hot zone."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.24"

RPM_NAME = "deepin-session-ui-5.5.24-1.4.aarch64.rpm"
RPM_HASH = "1de96dd943061d83d484115d6ddfbbb97f6e889d17e147c9e7bf4baf1ff940087974d62964157e1300305be3a3dc19af31d559c37dccdd9ec7ffac684ac2620b"

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
