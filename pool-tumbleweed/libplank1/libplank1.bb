SUMMARY = "Library for the Plank dock"
DESCRIPTION = "Plank is a trivial dock. \
It is, however, a library which can be extended to create other \
dock programs with more advanced features."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "libplank1-0.11.89-2.5.aarch64.rpm"
RPM_HASH = "4f401166cf85de206d27afb0673b02c43eb9de39ebe27150ce9b2bab144d7f092dc9ed394cdb565717c17e0409a6cea2b19fe50d83f049953adb09d34c7dcf60"

RPROVIDES:${PN} += "libplank.so.1 \
libplank1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libbamf3.so.2 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdbusmenu-glib.so.4 \
libdbusmenu-gtk3.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
