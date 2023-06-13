SUMMARY = "GtkMenuShell D-Bus exporter (GTK+ 2)"
DESCRIPTION = "This GTK 2 module exports GtkMenuShells over D-Bus."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "appmenu-gtk2-module-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "fbf854d7331ee16a3be94d84ab8881f73893a245fe82553d9584afdbfc9110212dffacd97772c75f9742bd5ecca4e5923f6413e5a9341757bcc1dfe158c86a65"

RPROVIDES:${PN} += "appmenu-gtk \
appmenu-gtk2-module \
appmenu-gtk2-module(aarch-64) \
libappmenu-gtk-module.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
appmenu-gtk-module-common \
gtk2-tools \
libappmenu-gtk2-parser.so.0()(64bit) \
libappmenu-gtk2-parser0 \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
