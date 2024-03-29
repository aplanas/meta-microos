SUMMARY = "Simon’s Improved Layout Engine"
DESCRIPTION = "SILE is a typesetting system; its job is to produce beautiful printed documents. \
Conceptually, SILE is similar to TeX—from which it borrows some concepts and even \
syntax and algorithms—but the similarities end there. Rather than being a \
derivative of the TeX family SILE is a new typesetting and layout engine written \
from the ground up using modern technologies and borrowing some ideas from \
graphical systems such as InDesign."
LICENSE = "MIT"

PV = "0.14.11"

RPM_NAME = "sile-0.14.11-1.1.aarch64.rpm"
RPM_HASH = "6a1d918ef4fdd4a1769fa657d2ee8b0230e0f1e225121967c9097ab83bc3504f43d9a318778a00a7012519b615cd448c35eb390f1ef403b22effaafb66cb4444"

RPROVIDES:${PN} += "sile"

RDEPENDS:${PN} += "fontconfig \
freetype2 \
git-core \
glibc \
icu \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
liblua5.4.so.5 \
libm.so.6 \
libtexpdf.so.0 \
lua54 \
lua54-bit32 \
lua54-cassowary \
lua54-cldr \
lua54-cliargs \
lua54-cosmo \
lua54-fluent \
lua54-linenoise \
lua54-loadkit \
lua54-lpeg \
lua54-luaepnf \
lua54-luaexpat \
lua54-luafilesystem \
lua54-luarepl \
lua54-luasec \
lua54-luasocket \
lua54-luautf8 \
lua54-penlight \
lua54-vstruct \
lua54-zlib"

inherit rpm
