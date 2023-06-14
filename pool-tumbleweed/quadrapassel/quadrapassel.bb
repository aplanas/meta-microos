SUMMARY = "Tetris Game for GNOME"
DESCRIPTION = "Quadrapassel is a version of Tetris, the classic game of interlocking \
four-piece blocks. As they fall from the top, the player must orient \
them to fit the other blocks at the bottom so that they form a \
complete horizontal line, in which case that line disappears and the \
player gains points"
LICENSE = "GPL-2.0-or-later"

PV = "40.2"

RPM_NAME = "quadrapassel-40.2-1.10.aarch64.rpm"
RPM_HASH = "e015963f31480d066958af69dfb83aeba0958298ea18c3512ae8a0ca1c0bfbeeb416810371349ada213a32b3934225315b86d0fe790f8eab8392dec11fb5014e"

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
