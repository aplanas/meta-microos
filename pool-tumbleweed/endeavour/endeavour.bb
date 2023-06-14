SUMMARY = "Personal task manager for GNOME"
DESCRIPTION = "A intuitive and powerful application to manage your personal tasks. \
It uses GNOME technologies and has complete integration with the \
GNOME desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "endeavour-43.0-1.1.aarch64.rpm"
RPM_HASH = "58a8e8bc199860910fb785849ebaa543f98924571af73f9b412d1982f417efd64f8202da839dae22105400271084e8cf4f63acb2e6bb4f334710c81e008b8622"

RPROVIDES:${PN} += "endeavour \
gnome-todo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libical-glib.so.3 \
libm.so.6 \
libpango-1.0.so.0 \
libpeas-1.0.so.0"

inherit rpm
