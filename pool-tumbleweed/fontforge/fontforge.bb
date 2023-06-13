SUMMARY = "A Font Editor"
DESCRIPTION = "FontForge allows editing of outline and bitmap fonts.  With it, you can \
create new fonts or modify old ones.  It also converts font formats and \
can convert among PostScript (ASCII & binary Type 1, some Type 3s, and \
some Type 0s), TrueType, OpenType (Type2), and CID-keyed fonts."
LICENSE = "GPL-3.0-or-later"

PV = "20230101"

RPM_NAME = "fontforge-20230101-1.3.aarch64.rpm"
RPM_HASH = "c58db7b1c44fde83b5c48cf43caf045363c22bcfbacd54e2fa273c8e18af4353e7039f4e05af77b7cfd7a4953072e91f850bf4bd932a07906b51dcb6dbe5730b"

RPROVIDES:${PN} += "application() \
application(org.fontforge.FontForge.desktop) \
fontforge \
fontforge(aarch-64) \
libfontforge.so.4()(64bit) \
metainfo() \
metainfo(org.fontforge.FontForge.appdata.xml) \
mimehandler(application/font-woff) \
mimehandler(application/vnd.font-fontforge-sfd) \
mimehandler(application/x-font-bdf) \
mimehandler(application/x-font-otf) \
mimehandler(application/x-font-pcf) \
mimehandler(application/x-font-tex) \
mimehandler(application/x-font-ttf) \
mimehandler(application/x-font-type1) \
mimehandler(font/otf) \
mimehandler(font/ttf) \
mimehandler(font/woff) \
mimehandler(font/woff2)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgdk-3.so.0()(64bit) \
libgif.so.7()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpython3.10.so.1.0()(64bit) \
libreadline.so.8()(64bit) \
libspiro.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libwoff2dec.so.1.0.2()(64bit) \
libwoff2enc.so.1.0.2()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit) \
python(abi)"

inherit rpm
