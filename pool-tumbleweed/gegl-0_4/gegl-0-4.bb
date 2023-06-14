SUMMARY = "Generic Graphics Library"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.44"

RPM_NAME = "gegl-0_4-0.4.44-1.2.aarch64.rpm"
RPM_HASH = "ba48472a3ed286dd02e62acf7393b18426f49a1bd981bda2791a65f82525bc89edb9070697a832eb43b5e7d3816a5f29f2bd881d4bea60300a206f565279e46f"

RPROVIDES:${PN} += "gegl-0-4 \
libgegl-npd-0.4.so \
libgegl-sc-0.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenEXR-3-1.so.30 \
libSDL2-2.0.so.0 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libbabl-0.1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgegl-0.4.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libjpeg.so.8 \
libjson-glib-1.0.so.0 \
liblcms2.so.2 \
liblensfun.so.1 \
libluajit-5.1.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libpoppler-glib.so.8 \
libraw.so.23 \
librsvg-2.so.2 \
libstdc++.so.6 \
libswscale.so.7 \
libtiff.so.6 \
libumfpack.so.5 \
libwebp.so.7"

inherit rpm
