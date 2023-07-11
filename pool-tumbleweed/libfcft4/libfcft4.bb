SUMMARY = "A library for font loading and glyph rasterization using FreeType/pixman"
DESCRIPTION = "fcft is a font loading and glyph rasterization library built on-top \
of FontConfig, FreeType2 and pixman."
LICENSE = "MIT"

PV = "3.1.5"

RPM_NAME = "libfcft4-3.1.5-1.4.aarch64.rpm"
RPM_HASH = "3cc3bb3d0dd4cb271bf3093aa330fbd8c2e4462dc498005f63fb22828ac186e5a09d4f5dde0fbba2e4aac0749040de3718fb379de88b4f7a13c89ef6de6c4e9d"

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
