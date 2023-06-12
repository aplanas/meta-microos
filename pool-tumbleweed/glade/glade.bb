SUMMARY = "User Interface Builder for GTK+ 3"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "glade-3.40.0-2.3.aarch64.rpm"
RPM_HASH = "04876c8496a96589f907bec1d15c1a7e5ef350d32704a399067a319f5bbb03a9a68a69e64601ed90d79e1ab3e6bd3e5ba8e198d682b045d30a8a2da920021e67"

RPROVIDES:${PN} += "application() \
application(org.gnome.Glade.desktop) \
glade \
glade(aarch-64) \
libgladegjs.so()(64bit) \
libgladegtk.so()(64bit) \
libgladepython.so()(64bit) \
metainfo() \
metainfo(org.gnome.Glade.appdata.xml) \
mimehandler(application/x-glade) \
mimehandler(application/x-gtk-builder)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgjs.so.0()(64bit) \
libgladeui-2.so.13()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpython3.10.so.1.0()(64bit)"

inherit rpm
