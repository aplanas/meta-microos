SUMMARY = "A graphical IRC (chat) client"
DESCRIPTION = "HexChat is a graphical IRC chat client for the X Window System. \
It allows to join multiple IRC channels (chat rooms) at the same time, \
talk publicly, private one-on-one conversations, etc. File transfers \
are possible."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-2.16.1-2.4.aarch64.rpm"
RPM_HASH = "8bb7b0cfca06a9126e163ca5d36a2ca8fbf08551897f06e6dab35ca40b87d57db1cfa6442b223496a030d5a71b604e7648556e9889a063ba25b9e839815f98ae"

RPROVIDES:${PN} += "hexchat \
xchat"

RDEPENDS:${PN} += "/bin/sh \
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
