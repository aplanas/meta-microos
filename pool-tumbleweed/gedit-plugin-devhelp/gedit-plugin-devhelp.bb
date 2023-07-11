SUMMARY = "Devhelp plugin for Gedit"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the Devhelp plugin for gedit."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "gedit-plugin-devhelp-43.0-2.2.aarch64.rpm"
RPM_HASH = "1168a2256c0e08c5421acab326f1867c1eb6b2d5d4b21e89d9b9c1398cd52a31dc12dbed782c6d124377cfcb70567364675b3fac735e8a3a7a9da6fdda4d05ba"

RPROVIDES:${PN} += "gedit-plugin-devhelp"

RDEPENDS:${PN} += "devhelp \
gedit \
typelib-GObject \
typelib-Gedit \
typelib-Gio \
typelib-Gtk"

inherit rpm
