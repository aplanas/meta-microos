SUMMARY = "Desktop GUI client for browsing Geminispace"
DESCRIPTION = "Lagrange is a desktop GUI client for browsing Geminispace. It offers modern \
conveniences familiar from web browsers, such as smooth scrolling, inline image \
viewing, multiple tabs, visual themes, Unicode fonts, bookmarks, history, and \
page outlines."
LICENSE = "BSD-2-Clause"

PV = "1.16.5"

RPM_NAME = "lagrange-1.16.5-1.1.aarch64.rpm"
RPM_HASH = "8062911ea4ab5c33476e1d753f0952ccfcc24d15ec2e782dd8b40a6538bcf1cf2877c7a4ce261e1bc11de6454688041f9f01dcfb106fb5a2603dec90ba5786e3"

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
