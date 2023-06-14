SUMMARY = "A D-Bus explorer for GNOME"
DESCRIPTION = "D-Spy is a simple tool to explore D-Bus connections."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "d-spy-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "6ef82d3063f83d9f4829714822ed69ff1cdb496e2805ef519d7028d47c17daf46c7304a7c586664cba6d7fd5bba187dfec3bb5111e217f53821cf0adf59269a2"

RPROVIDES:${PN} += "d-spy"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libdspy-1.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
