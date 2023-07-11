SUMMARY = "A Font Editor"
DESCRIPTION = "FontForge allows editing of outline and bitmap fonts.  With it, you can \
create new fonts or modify old ones.  It also converts font formats and \
can convert among PostScript (ASCII & binary Type 1, some Type 3s, and \
some Type 0s), TrueType, OpenType (Type2), and CID-keyed fonts."
LICENSE = "GPL-3.0-or-later"

PV = "20230101"

RPM_NAME = "fontforge-20230101-1.4.aarch64.rpm"
RPM_HASH = "2da4da150623dfc41431f57b8be8c07768f2ed82d9fd8dfe12b3e5b6364d5b9594f9304faf9ca9061ae649dfe1caf5fd4c24bbefa546815c01e47ae0ab4c5d95"

RPROVIDES:${PN} += "fontforge \
libfontforge.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgif.so.7 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libpython3.11.so.1.0 \
libreadline.so.8 \
libspiro.so.1 \
libstdc++.so.6 \
libtiff.so.6 \
libwoff2dec.so.1.0.2 \
libwoff2enc.so.1.0.2 \
libxml2.so.2 \
libz.so.1 \
python-abi"

inherit rpm
