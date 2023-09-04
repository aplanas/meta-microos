SUMMARY = "NetworkManager curses-based UI"
DESCRIPTION = "This adds a curses-based 'TUI' (Text User Interface) to \
NetworkManager, to allow performing some of the operations supported \
by nm-connection-editor and nm-applet in a non-graphical environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.44.0"

RPM_NAME = "NetworkManager-tui-1.44.0-1.1.aarch64.rpm"
RPM_HASH = "9e055a092b11392cc4ec1eeac6cf479aa3dae789f6f6dfbc9bbeb0471bc30c0aab44d4bfeb3f96b725972c42a20a1b9247036990cf28b52c031bcb3d401a5d28"

RPROVIDES:${PN} += "NetworkManager-tui"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnewt.so.0.52 \
libnm.so.0 \
libnm0"

inherit rpm
