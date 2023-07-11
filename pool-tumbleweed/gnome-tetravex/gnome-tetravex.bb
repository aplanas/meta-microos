SUMMARY = "Tetravex Game for GNOME"
DESCRIPTION = "Tetravex is a simple puzzle game in which pieces have numbers on each \
side. The pieces must be positioned so that the same numbers touch \
each other, during which you are being timed. The times are then \
stored in a system-wide scoreboard."
LICENSE = "GPL-2.0-or-later"

PV = "3.38.2"

RPM_NAME = "gnome-tetravex-3.38.2-2.8.aarch64.rpm"
RPM_HASH = "132016bc7d9b1e113a726deab7552d61aabb3f1e732fa6ffd893955b09b0bd8e9026065384c20d23885ff683b50b766fe099ceda56ef8cb463024d2eda71f07d"

RPROVIDES:${PN} += "gnome-tetravex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
