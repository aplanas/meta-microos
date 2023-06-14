SUMMARY = "Sliding block puzzle game"
DESCRIPTION = "2048 is a single-player sliding block puzzle game, in which the \
objective is to slide and merge same-numbered tiles on a grid to \
reach higher numbers."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.2"

RPM_NAME = "gnome-2048-3.38.2-2.7.aarch64.rpm"
RPM_HASH = "e512284d0f4454708f9cb1025819b8c68651a1d407d8971e4faa3f76f6e9cb5ab0ca49440b2ef873918230e344b7ac88a6f52ffd773f8b4cffa8e14ed63caf7c"

RPROVIDES:${PN} += "gnome-2048"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-games-support-1.so.3 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
