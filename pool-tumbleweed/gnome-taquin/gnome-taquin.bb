SUMMARY = "A computer version of the 15-puzzle and other sliding puzzles"
DESCRIPTION = "Taquin is a computer version of the 15-puzzle and other sliding puzzles. \
 \
The object of Taquin is to move tiles so that they reach their places, \
either indicated with numbers, or with parts of a great image."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.1"

RPM_NAME = "gnome-taquin-3.38.1-2.12.aarch64.rpm"
RPM_HASH = "d8b783f7446b9d4eb37b39088d3e2cb11460b2e656f401d0575be35b0fef0e555380be4fa55f31f639107582502b42a8f555d2c384b927a8779c89c55d36d4b6"

RPROVIDES:${PN} += "gnome-taquin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-3.so.0"

inherit rpm
