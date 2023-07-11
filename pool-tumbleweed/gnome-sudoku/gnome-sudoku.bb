SUMMARY = "Sudoku Game for GNOME"
DESCRIPTION = "Sudoku is a logic puzzle game, in which one must fill a 9 by 9 square \
with the correct digits."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-sudoku-44.0-1.2.aarch64.rpm"
RPM_HASH = "9b70b8c5a6ed13ad4f20154a4b46ab4599b63a1846bf5d90dae2a34bba2ff1e8b5ec8315cf7eedec67024caedb6c9276e3f9e44d060119b98e63455c24c4e267"

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
