SUMMARY = "A text to postscript converter through pango"
DESCRIPTION = "paps is a command line program for converting Unicode text encoded in UTF-8 to postscript and pdf by using pango."
LICENSE = "LGPL-2.0-only"

PV = "0.7.1"

RPM_NAME = "paps-0.7.1-3.7.aarch64.rpm"
RPM_HASH = "7065ba4ad2db692517524688c7b328df4d3617d619e8b0db059800f982c1695183a81f5246150cc45855ab59777eb506a421c7c2826b6996e691eca132c17d89"

RPROVIDES:${PN} += "paps"

RDEPENDS:${PN} += "glibc-locale \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0"

inherit rpm
