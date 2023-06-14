SUMMARY = "A better Qt application inclusion under GNOME"
DESCRIPTION = "QGnomePlatform is a Qt Platform Theme designed to use as many of the GNOME \
settings as possible in unmodified Qt applications. It allows Qt applications \
to fit into the environment as well as possible."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & LGPL-2.1-or-later"

PV = "0.9.1"

RPM_NAME = "QGnomePlatform-qt6-0.9.1-1.2.aarch64.rpm"
RPM_HASH = "36772157f6df0d210821c6a23c407aa04ff55aeea8739c097290e7c47fdc4dc41f1cd7e9f3c3d660d337680652463faaba9bfc7fe575c5f3f3fb32cac9a449da"

RPROVIDES:${PN} += "QGnomePlatform-qt6 \
libqgnomeplatform6.so \
libqgnomeplatformdecoration.so \
libqgnomeplatformtheme.so"

RDEPENDS:${PN} += "QGnomePlatform-colorschemes \
adwaita-qt6 \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6QuickControls2.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libadwaitaqt6.so.1 \
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
