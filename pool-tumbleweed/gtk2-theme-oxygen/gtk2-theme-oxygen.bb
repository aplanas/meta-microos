SUMMARY = "Oxygen GTK 2.x Theme"
DESCRIPTION = "Oxygen-Gtk2 is a port of the KDE Oxygen widget theme to Gtk 2.x. \
 \
It's primary goal is to ensure visual consistency between Gtk-based \
and Qt-based applications. A secondary objective \
is to also have a stand-alone nice looking gtk theme that would \
behave well on other Desktop Environments. \
 \
This package contains the Oxygen Gtk 2.x theme."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.6"

RPM_NAME = "gtk2-theme-oxygen-1.4.6-5.19.aarch64.rpm"
RPM_HASH = "bbbcd2eb72ab7dd6ac55483ef16c9c2d080c6d392825caa4084a879571d7390e39404717037c496cb73babbee3310ed7f19164ec39a9f3b21f10fc15857de9be"

RPROVIDES:${PN} += "gtk2-theme-oxygen \
oxygen-gtk2"

RDEPENDS:${PN} += "gtk2-engine-oxygen \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
