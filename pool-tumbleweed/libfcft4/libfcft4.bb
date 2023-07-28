SUMMARY = "A library for font loading and glyph rasterization using FreeType/pixman"
DESCRIPTION = "fcft is a font loading and glyph rasterization library built on-top \
of FontConfig, FreeType2 and pixman."
LICENSE = "MIT"

PV = "3.1.6"

RPM_NAME = "libfcft4-3.1.6-1.1.aarch64.rpm"
RPM_HASH = "707b27ae5c89e58ed1a4242c8376bb97c7526d274bd506a8dce0a3995f58d4d650d9eda1ca617778c37a9b99bca6465b33f2742d8c63370cc7197d755dd876ba"

RPROVIDES:${PN} += "libfcft.so.4 \
libfcft4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libharfbuzz.so.0 \
libm.so.6 \
libpixman-1.so.0 \
libutf8proc.so.2"

inherit rpm
