SUMMARY = "NetworkManager curses-based UI"
DESCRIPTION = "This adds a curses-based 'TUI' (Text User Interface) to \
NetworkManager, to allow performing some of the operations supported \
by nm-connection-editor and nm-applet in a non-graphical environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-tui-1.42.6-2.1.aarch64.rpm"
RPM_HASH = "458192b2b280514a566fcc1d5abfa209bd2ad0182b9aa0b150bea472df16793f18871727973e4f35b9ceb288fb0616beda5c54099338856a0c1801092e9e6bce"

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
