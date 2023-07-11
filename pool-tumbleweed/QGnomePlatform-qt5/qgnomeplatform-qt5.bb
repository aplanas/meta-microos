SUMMARY = "A better Qt application inclusion under GNOME"
DESCRIPTION = "QGnomePlatform is a Qt Platform Theme designed to use as many of the GNOME \
settings as possible in unmodified Qt applications. It allows Qt applications \
to fit into the environment as well as possible."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & LGPL-2.1-or-later"

PV = "0.9.1"

RPM_NAME = "QGnomePlatform-qt5-0.9.1-1.2.aarch64.rpm"
RPM_HASH = "a75ea2283106264258407963d2a56d76a78111958f640e57aa79c0c025922de67501537a1e6d7363ced8f83d33de973ffe5873af869fc6a4a4d6da2ad7d7b2c3"

RPROVIDES:${PN} += "QGnomePlatform \
QGnomePlatform-qt5 \
libqgnomeplatform.so \
libqgnomeplatformdecoration.so \
libqgnomeplatformtheme.so"

RDEPENDS:${PN} += "QGnomePlatform-colorschemes \
adwaita-qt5 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5QuickControls2.so.5 \
libQt5WaylandClient.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libadwaitaqt.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
