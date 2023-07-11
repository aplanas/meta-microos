SUMMARY = "Oxygen GTK 2.x Theme Engine"
DESCRIPTION = "Oxygen-Gtk2 is a port of the KDE Oxygen widget theme to Gtk 2.x. \
 \
It's primary goal is to ensure visual consistency between Gtk-based \
and Qt-based applications. A secondary objective \
is to also have a stand-alone nice looking gtk theme that would \
behave well on other Desktop Environments. \
 \
This package contains the Oxygen Gtk 2.x theme engine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.6"

RPM_NAME = "gtk2-engine-oxygen-1.4.6-5.20.aarch64.rpm"
RPM_HASH = "e7242852ec560faad4b1c43a60ab2cffe0d5ea1f3e5b03a3dcb69443eb0cc92c8b1a2cdfd744b9b0d75103e88b76049e06f683b69a692beecdfdc16432f4f004"

RPROVIDES:${PN} += "gtk2-engine-oxygen \
liboxygen-gtk.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
