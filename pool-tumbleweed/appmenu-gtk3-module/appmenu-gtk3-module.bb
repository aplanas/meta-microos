SUMMARY = "GtkMenuShell D-Bus exporter (GTK+ 3)"
DESCRIPTION = "This GTK 3 module exports GtkMenuShells over D-Bus."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "appmenu-gtk3-module-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "83fce9b622f6672884fe0ded4fe9c1a35deff9dd4c05befdb1626e58213fda1e319d938b1fdbdc1dc6f5be835f0df75a3faebd513fd82d22aaefe2799664e4e9"

RPROVIDES:${PN} += "appmenu-gtk3 \
appmenu-gtk3-module \
appmenu-gtk3-module(aarch-64) \
libappmenu-gtk-module.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
appmenu-gtk-module-common \
gtk3-tools \
libappmenu-gtk3-parser.so.0()(64bit) \
libappmenu-gtk3-parser0 \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
