SUMMARY = "A D-Bus explorer for GNOME"
DESCRIPTION = "D-Spy is a simple tool to explore D-Bus connections."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "d-spy-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "6ef82d3063f83d9f4829714822ed69ff1cdb496e2805ef519d7028d47c17daf46c7304a7c586664cba6d7fd5bba187dfec3bb5111e217f53821cf0adf59269a2"

RPROVIDES:${PN} += "application() \
application(org.gnome.dspy.desktop) \
d-spy \
d-spy(aarch-64) \
metainfo() \
metainfo(org.gnome.dspy.appdata.xml)"
RDEPENDS:${PN} += "libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdspy-1.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit)"

inherit rpm
