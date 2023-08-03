SUMMARY = "Desktop GUI client for browsing Geminispace"
DESCRIPTION = "Lagrange is a desktop GUI client for browsing Geminispace. It offers modern \
conveniences familiar from web browsers, such as smooth scrolling, inline image \
viewing, multiple tabs, visual themes, Unicode fonts, bookmarks, history, and \
page outlines."
LICENSE = "BSD-2-Clause"

PV = "1.16.6"

RPM_NAME = "lagrange-1.16.6-1.1.aarch64.rpm"
RPM_HASH = "4f65773deb233104031e548aac4342b7296bb04af48ba346f6de603b76587a43e882b33b4b9e09bd2a8f8e6baa2203a36e676da2910936b0868b3346580e8087"

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
