SUMMARY = "GtkMenuShell D-Bus exporter (GTK+ 3)"
DESCRIPTION = "This GTK 3 module exports GtkMenuShells over D-Bus."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "appmenu-gtk3-module-0.7.6-2.1.aarch64.rpm"
RPM_HASH = "bfa4e41ee7288cc8ef9d99b55d4f6120d04c271227f6c03595b6e9a17198e236c07d3e5781e6910d3c8755f8e6ea94cfe7a9750d93c7e5992deacba8b487f8c1"

RPROVIDES:${PN} += "appmenu-gtk3 \
appmenu-gtk3-module \
libappmenu-gtk-module.so"

RDEPENDS:${PN} += "/usr/bin/sh \
appmenu-gtk-module-common \
libappmenu-gtk3-parser.so.0 \
libappmenu-gtk3-parser0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
