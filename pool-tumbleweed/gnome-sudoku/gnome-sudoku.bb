SUMMARY = "Sudoku Game for GNOME"
DESCRIPTION = "Sudoku is a logic puzzle game, in which one must fill a 9 by 9 square \
with the correct digits."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-sudoku-44.0-1.1.aarch64.rpm"
RPM_HASH = "0f705bc65c70d36ddaf59e6132a2856a1c015a94ca871f35d609ac29b7eb0617c971b6a000420976e7f22a4a352072287593053d5980083e35057300b40ca154"

RPROVIDES:${PN} += "gnome-sudoku"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libqqwing.so.2 \
libstdc++.so.6"

inherit rpm
