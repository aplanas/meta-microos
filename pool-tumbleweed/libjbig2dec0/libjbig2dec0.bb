SUMMARY = "JBIG2 Decoder Library"
DESCRIPTION = "jbig2dec is a decoder utility implementing the JBIG2 bi-level image compression \
spec. Also known as ITU T.88 and ISO IEC 14492, and included by reference in \
Adobe's PDF version 1.4 and later."
LICENSE = "AGPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "libjbig2dec0-0.19-1.12.aarch64.rpm"
RPM_HASH = "9645cbe1f39c68a1cb9f306f4401c7e678af0b2ff31ecfe29841a7b8710a7bb6f20fcf97df97530ba24a2cf748ac6587636d43590058a61b29449b2d80bd846b"

RPROVIDES:${PN} += "libjbig2dec.so.0 \
libjbig2dec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
