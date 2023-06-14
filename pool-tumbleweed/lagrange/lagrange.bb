SUMMARY = "Desktop GUI client for browsing Geminispace"
DESCRIPTION = "Lagrange is a desktop GUI client for browsing Geminispace. It offers modern \
conveniences familiar from web browsers, such as smooth scrolling, inline image \
viewing, multiple tabs, visual themes, Unicode fonts, bookmarks, history, and \
page outlines."
LICENSE = "BSD-2-Clause"

PV = "1.16.2"

RPM_NAME = "lagrange-1.16.2-1.1.aarch64.rpm"
RPM_HASH = "89805012df44c267c8da9c8ee9f53b8991687f8161dbca712f3e1bb8472bf67a4a548a363b82a99573a77276f58a32a4333f99087d770cb155403ee2025dfc0b"

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
