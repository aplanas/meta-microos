SUMMARY = "Tetris Game for GNOME"
DESCRIPTION = "Quadrapassel is a version of Tetris, the classic game of interlocking \
four-piece blocks. As they fall from the top, the player must orient \
them to fit the other blocks at the bottom so that they form a \
complete horizontal line, in which case that line disappears and the \
player gains points"
LICENSE = "GPL-2.0-or-later"

PV = "40.2"

RPM_NAME = "quadrapassel-40.2-1.11.aarch64.rpm"
RPM_HASH = "e16a1c73b5491e505893a18f43d7cc2332efb38ca64017f51a5191448425a28aade0dd6f00ff506f75e506e4c75ff057fe75b22389a54e57b693ed09768ac96e"

RPROVIDES:${PN} += "quadrapassel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmanette-0.2.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
