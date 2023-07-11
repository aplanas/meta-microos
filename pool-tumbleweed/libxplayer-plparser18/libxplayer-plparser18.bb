SUMMARY = "A simple GObject-based library to parse playlist formats"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "libxplayer-plparser18-1.0.2-2.13.aarch64.rpm"
RPM_HASH = "647d0e926ce5b25d8d1df64917619ea93c66732d642a9996c8bccd05b83fd738fd0befb6d310eb16604e1357a0a055e765b7f0f1d9855d476b0cda431b624a15"

RPROVIDES:${PN} += "libxplayer-plparser.so.18 \
libxplayer-plparser18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libsoup-2.4.so.1 \
libxml2.so.2 \
xplayer-plparser"

inherit rpm
