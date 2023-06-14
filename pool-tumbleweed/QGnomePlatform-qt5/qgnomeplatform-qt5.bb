SUMMARY = "A better Qt application inclusion under GNOME"
DESCRIPTION = "QGnomePlatform is a Qt Platform Theme designed to use as many of the GNOME \
settings as possible in unmodified Qt applications. It allows Qt applications \
to fit into the environment as well as possible."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & LGPL-2.1-or-later"

PV = "0.9.1"

RPM_NAME = "QGnomePlatform-qt5-0.9.1-1.1.aarch64.rpm"
RPM_HASH = "9aa3a530ec3b0cb51f55c4d12484f6970a6ff8fd732b3e8173ef2c9162588b69abb6b88ba33a283cb2fd9377b8ffa4d64d92ae1966a6945efaff8409b0343767"

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
