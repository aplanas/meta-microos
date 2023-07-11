SUMMARY = "Sliding block puzzle game"
DESCRIPTION = "2048 is a single-player sliding block puzzle game, in which the \
objective is to slide and merge same-numbered tiles on a grid to \
reach higher numbers."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.2"

RPM_NAME = "gnome-2048-3.38.2-2.8.aarch64.rpm"
RPM_HASH = "51491382e576aa2714345fb920bc1d0956c968974fe0996a9647df5a8a707a42aa791a83b432eed32e510205da3b2a4961a80e43def6d8ca24c0d562009306cf"

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
