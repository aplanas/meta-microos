SUMMARY = "Desktop GUI client for browsing Geminispace"
DESCRIPTION = "Lagrange is a desktop GUI client for browsing Geminispace. It offers modern \
conveniences familiar from web browsers, such as smooth scrolling, inline image \
viewing, multiple tabs, visual themes, Unicode fonts, bookmarks, history, and \
page outlines."
LICENSE = "BSD-2-Clause"

PV = "1.16.7"

RPM_NAME = "lagrange-1.16.7-1.1.aarch64.rpm"
RPM_HASH = "e62dadfb1bb9f70cecd310d270daef8689e92d81afd00556aa9b3c0d9b5f5355c8eb95927d5c6c671408f654ecd6b4d436b7b64744485f55e666ae8727ce47f8"

RPROVIDES:${PN} += "lagrange"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libcrypto.so.3 \
libfribidi.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libmpg123.so.0 \
libpcre2-8.so.0 \
libssl.so.3 \
libunistring.so.5 \
libwebp.so.7 \
libz.so.1"

inherit rpm
