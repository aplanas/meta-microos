SUMMARY = "A graphical IRC (chat) client"
DESCRIPTION = "HexChat is a graphical IRC chat client for the X Window System. \
It allows to join multiple IRC channels (chat rooms) at the same time, \
talk publicly, private one-on-one conversations, etc. File transfers \
are possible."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-2.16.1-2.4.aarch64.rpm"
RPM_HASH = "8bb7b0cfca06a9126e163ca5d36a2ca8fbf08551897f06e6dab35ca40b87d57db1cfa6442b223496a030d5a71b604e7648556e9889a063ba25b9e839815f98ae"

RPROVIDES:${PN} += "application() \
application(io.github.Hexchat.desktop) \
hexchat \
hexchat(aarch-64) \
metainfo() \
metainfo(io.github.Hexchat.appdata.xml) \
mimehandler(x-scheme-handler/irc) \
mimehandler(x-scheme-handler/ircs) \
xchat"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcanberra.so.0()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpci.so.3()(64bit) \
libpci.so.3(LIBPCI_3.0)(64bit) \
libpci.so.3(LIBPCI_3.5)(64bit) \
libpci.so.3(LIBPCI_3.8)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
