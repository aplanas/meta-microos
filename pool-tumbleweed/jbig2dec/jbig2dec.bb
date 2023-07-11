SUMMARY = "JBIG2 Decoder Utility"
DESCRIPTION = "jbig2dec is a decoder utility implementing the JBIG2 bi-level image compression \
spec. Also known as ITU T.88 and ISO IEC 14492, and included by reference in \
Adobe's PDF version 1.4 and later."
LICENSE = "AGPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "jbig2dec-0.19-1.12.aarch64.rpm"
RPM_HASH = "4c2e60fae9d1b881802a672f35ad8e2a0123244247c247d9e736a2796a3d8c689d468241192f2e4931f654bfca2b63032f0401537d89e0143ee707f94661fa4f"

RPROVIDES:${PN} += "jbig2dec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjbig2dec.so.0 \
libpng16.so.16"

inherit rpm
