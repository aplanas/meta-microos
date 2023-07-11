SUMMARY = "A graphical IRC (chat) client"
DESCRIPTION = "HexChat is a graphical IRC chat client for the X Window System. \
It allows to join multiple IRC channels (chat rooms) at the same time, \
talk publicly, private one-on-one conversations, etc. File transfers \
are possible."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-2.16.1-2.7.aarch64.rpm"
RPM_HASH = "8ea5540d3b025866186eb27b8223db509c35e40d15283a00914985cf93d2ce713ce63b71eaae8f7b442a336e07a941ec9d23c7279a82f87cc67555d0e1c8f970"

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
