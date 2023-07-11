SUMMARY = "Shared library for woff2"
DESCRIPTION = "Web Open Font Format (WOFF) 2.0 is an update to the existing WOFF \
1.0 with improved compression that is achieved by using the Brotli \
algorithm. The primary purpose of the WOFF2 format is to \
efficiently package fonts linked to Web documents by means of CSS \
@font-face rules. \
 \
This package contains the shared library for woff2."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libwoff2enc1_0_2-1.0.2-4.4.aarch64.rpm"
RPM_HASH = "eb09e242525daba36d6c338e980c24742be0aa81d651be1d33a6ecfe44e313cd27feec29e8a75c5539e8d459f7b666f8eebe67e498b6c1c501ceca1e406bd85e"

RPROVIDES:${PN} += "libwoff2enc.so.1.0.2 \
libwoff2enc1-0-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwoff2common.so.1.0.2"

inherit rpm
