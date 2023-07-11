SUMMARY = "NetworkManager curses-based UI"
DESCRIPTION = "This adds a curses-based 'TUI' (Text User Interface) to \
NetworkManager, to allow performing some of the operations supported \
by nm-connection-editor and nm-applet in a non-graphical environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.8"

RPM_NAME = "NetworkManager-tui-1.42.8-1.1.aarch64.rpm"
RPM_HASH = "7ce8ed72c6d3d3613430085d045d4b40978e56214cb0f759b7603295640cb23692565063004b5683184fb8b5599c106e4c04ff35aa2d87c024d0a6f892f84197"

RPROVIDES:${PN} += "NetworkManager-tui"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnewt.so.0.52 \
libnm.so.0 \
libnm0"

inherit rpm
