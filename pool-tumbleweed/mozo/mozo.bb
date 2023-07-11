SUMMARY = "MATE Desktop menu editor"
DESCRIPTION = "This package provides Mozo, a menu editor for the MATE Desktop, \
using the freedesktop.org menu specification."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.2"

RPM_NAME = "mozo-1.26.2-1.3.noarch.rpm"
RPM_HASH = "1d2feb095e93418f030ffcc7faffbff4b35fdd890cdf019a67ebbd25fa3fe963118783305f1541f759499a0e03c9254be0cc0cb38ba595235c00dbe2991a8062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-menu-editor \
mozo"

RDEPENDS:${PN} += "/usr/bin/python3 \
mate-menus \
python-abi \
python3-gobject \
python3-gobject-Gdk \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-MateMenu"

inherit rpm
