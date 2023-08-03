SUMMARY = "GtkMenuShell D-Bus exporter (GTK+ 2)"
DESCRIPTION = "This GTK 2 module exports GtkMenuShells over D-Bus."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "appmenu-gtk2-module-0.7.6-2.1.aarch64.rpm"
RPM_HASH = "70edbb6e92efa40a82ddd6c8376e078be47a86b4503b39b3d981554d2088fbf4d00621be725bfa2813759d8ba36e9227aa21246582ab406c17156528bc348151"

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
