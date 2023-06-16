SUMMARY = "GtkMenuShell D-Bus exporter (GTK+ 2)"
DESCRIPTION = "This GTK 2 module exports GtkMenuShells over D-Bus."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "appmenu-gtk2-module-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "fbf854d7331ee16a3be94d84ab8881f73893a245fe82553d9584afdbfc9110212dffacd97772c75f9742bd5ecca4e5923f6413e5a9341757bcc1dfe158c86a65"

RPROVIDES:${PN} += "appmenu-gtk \
appmenu-gtk2-module \
libappmenu-gtk-module.so"

RDEPENDS:${PN} += "/usr/bin/sh \
appmenu-gtk-module-common \
gtk2-tools \
libappmenu-gtk2-parser.so.0 \
libappmenu-gtk2-parser0 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
