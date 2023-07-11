SUMMARY = "Mini version of the Totem playlist parser library"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.6"

RPM_NAME = "libtotem-plparser-mini18-3.26.6-2.9.aarch64.rpm"
RPM_HASH = "ca0805dad1b19d5a94fbe842cc1c263c9e3ea602f78ff9d35f8765a570fe2759a5bd6080996b0710bd7079b028651519ea85fd07cd867a34b1c8f0b9be965770"

RPROVIDES:${PN} += "libtotem-plparser-mini.so.18 \
libtotem-plparser-mini18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
totem-pl-parser"

inherit rpm
