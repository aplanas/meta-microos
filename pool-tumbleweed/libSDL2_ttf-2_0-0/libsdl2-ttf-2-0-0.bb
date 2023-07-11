SUMMARY = "Simple DirectMedia Layer 2 Truetype library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.20.2"

RPM_NAME = "libSDL2_ttf-2_0-0-2.20.2-1.4.aarch64.rpm"
RPM_HASH = "9dfaa7c2a12a83ecc956d37b7592e9ca90c50f52fa1c30d99d5839b9dde4bb893c271bbf08025aa0727f682b04099c8f3d44666ae75eab4877479ddb38282abe"

RPROVIDES:${PN} += "SDL2-ttf \
libSDL2-ttf-2-0-0 \
libSDL2-ttf-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
