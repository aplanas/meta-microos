SUMMARY = "A GObject-based library to parse playlist formats"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.6"

RPM_NAME = "libtotem-plparser18-3.26.6-2.8.aarch64.rpm"
RPM_HASH = "271673cd75fda0b129e922771a1bac49e8686f021edf54930cadf09d5ceabd336d7e5029c2b85c625076426bcf2ff5c970500a50749dcc3d20473aea89fb8b1f"

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
