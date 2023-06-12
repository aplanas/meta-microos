SUMMARY = "Personal task manager for GNOME"
DESCRIPTION = "A intuitive and powerful application to manage your personal tasks. \
It uses GNOME technologies and has complete integration with the \
GNOME desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "endeavour-43.0-1.1.aarch64.rpm"
RPM_HASH = "58a8e8bc199860910fb785849ebaa543f98924571af73f9b412d1982f417efd64f8202da839dae22105400271084e8cf4f63acb2e6bb4f334710c81e008b8622"

RPROVIDES:${PN} += "application() \
application(org.gnome.Todo.desktop) \
endeavour \
endeavour(aarch-64) \
gnome-todo \
metainfo() \
metainfo(org.gnome.Todo.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgoa-1.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libical-glib.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit)"

inherit rpm
