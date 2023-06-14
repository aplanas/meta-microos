SUMMARY = "A Font Editor"
DESCRIPTION = "FontForge allows editing of outline and bitmap fonts.  With it, you can \
create new fonts or modify old ones.  It also converts font formats and \
can convert among PostScript (ASCII & binary Type 1, some Type 3s, and \
some Type 0s), TrueType, OpenType (Type2), and CID-keyed fonts."
LICENSE = "GPL-3.0-or-later"

PV = "20230101"

RPM_NAME = "fontforge-20230101-1.3.aarch64.rpm"
RPM_HASH = "c58db7b1c44fde83b5c48cf43caf045363c22bcfbacd54e2fa273c8e18af4353e7039f4e05af77b7cfd7a4953072e91f850bf4bd932a07906b51dcb6dbe5730b"

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
libpython3.10.so.1.0 \
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
