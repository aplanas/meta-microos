SUMMARY = "Web Open Font Format 2.0 library"
DESCRIPTION = "Web Open Font Format (WOFF) 2.0 is an update to the existing WOFF \
1.0 with improved compression that is achieved by using the Brotli \
algorithm. The primary purpose of the WOFF2 format is to \
efficiently package fonts linked to Web documents by means of CSS \
@font-face rules."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "woff2-1.0.2-4.4.aarch64.rpm"
RPM_HASH = "6629099b2e9414339c58fb2659f3f568dce6eae401d54e7148f00f0af9072faddfb76e4022c9cefed19636fd7ca2217e72824d1f9ed327b61b887e41b8712023"

RPROVIDES:${PN} += "woff2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwoff2common.so.1.0.2 \
libwoff2dec.so.1.0.2 \
libwoff2enc.so.1.0.2"

inherit rpm
