SUMMARY = "Generic Graphics Library"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.44"

RPM_NAME = "gegl-0_4-0.4.44-1.2.aarch64.rpm"
RPM_HASH = "ba48472a3ed286dd02e62acf7393b18426f49a1bd981bda2791a65f82525bc89edb9070697a832eb43b5e7d3816a5f29f2bd881d4bea60300a206f565279e46f"

RPROVIDES:${PN} += "gegl-0_4 \
gegl-0_4(aarch-64) \
libgegl-npd-0.4.so()(64bit) \
libgegl-sc-0.4.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libbabl-0.1.so.0()(64bit) \
libbabl-0.1.so.0(V0_1_0)(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgegl-0.4.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgomp.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
liblcms2.so.2()(64bit) \
liblensfun.so.1()(64bit) \
libluajit-5.1.so.2()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpoppler-glib.so.8()(64bit) \
libraw.so.23()(64bit) \
librsvg-2.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libswscale.so.7()(64bit) \
libtiff.so.6()(64bit) \
libumfpack.so.5()(64bit) \
libwebp.so.7()(64bit)"

inherit rpm
