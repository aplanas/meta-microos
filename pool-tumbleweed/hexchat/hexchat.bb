SUMMARY = "A graphical IRC (chat) client"
DESCRIPTION = "HexChat is a graphical IRC chat client for the X Window System. \
It allows to join multiple IRC channels (chat rooms) at the same time, \
talk publicly, private one-on-one conversations, etc. File transfers \
are possible."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-2.16.1-2.8.aarch64.rpm"
RPM_HASH = "cabbcb8398f62d272ae3c4140d5377e3fec962188be2912d8c54bb9d3736a372ab60ff707e8da1612bfa40d5b3986cef6937adf26697ae1e7d1df5ac07f3d659"

RPROVIDES:${PN} += "hexchat \
xchat"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcanberra.so.0 \
libcrypto.so.3 \
libdbus-glib-1.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpci.so.3 \
libssl.so.3"

inherit rpm
