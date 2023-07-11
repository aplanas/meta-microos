SUMMARY = "Simple GObject-based library to parse playlist formats -- Mini Version"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "libxplayer-plparser-mini18-1.0.2-2.13.aarch64.rpm"
RPM_HASH = "d947a386ba9ddd18def02a89d6815a47c822246f2eee96548a891dc2dbe6f85c05837fe1dcc169063c436b2484271ef0580476f1aa9808dd6aaf6857ad1bc5e1"

RPROVIDES:${PN} += "libxplayer-plparser-mini.so.18 \
libxplayer-plparser-mini18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
xplayer-plparser"

inherit rpm
