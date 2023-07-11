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

RPM_NAME = "gtk2-theme-oxygen-1.4.6-5.20.aarch64.rpm"
RPM_HASH = "b7e4889da293c52452db3ab61830d2a9bf2312cb1d6e042cfbb67694305380e63278a8f23ff4ca227e94a4b4e2d41522843a66a307b75be86f53bb34c3ab7b41"

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
