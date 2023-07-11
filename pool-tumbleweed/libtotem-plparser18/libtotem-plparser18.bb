SUMMARY = "A GObject-based library to parse playlist formats"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.6"

RPM_NAME = "libtotem-plparser18-3.26.6-2.9.aarch64.rpm"
RPM_HASH = "c7ee7ed73ca9a25f7f442ea02eec7c1593c129622c3064f3b0b6b55344c52b9b6e5c9895d2086a85a0d805f4ee3f5f76a3cbb7cfb5636c0ddf7c1eac2ac4dd5f"

RPROVIDES:${PN} += "libtotem-plparser.so.18 \
libtotem-plparser18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.2 \
totem-pl-parser"

inherit rpm
