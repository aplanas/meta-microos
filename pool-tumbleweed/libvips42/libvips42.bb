SUMMARY = "C/C++ library for processing large images"
DESCRIPTION = "VIPS is an image processing system. It is good with large images \
(images larger than the amount of RAM you have available), with many CPUs, \
for working with colour, for scientific analysis and for general \
research and development."
LICENSE = "LGPL-2.1-only"

PV = "8.13.3"

RPM_NAME = "libvips42-8.13.3-1.5.aarch64.rpm"
RPM_HASH = "1cdb0b11bdf2c9a0b70e2fba807bb59856fb37ab7649e9110c96505f7a0f51f4526d15104ff81f4e037da4885bfecea8155b2ac3e34e08429875cb53d3dbb421"

RPROVIDES:${PN} += "libvips-cpp.so.42 \
libvips.so.42 \
libvips42"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenEXR-3-1.so.30 \
libc.so.6 \
libcairo.so.2 \
libcfitsio.so.10 \
libexif.so.12 \
libexpat.so.1 \
libfftw3.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libimagequant.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libmatio.so.11 \
libopenjp2.so.7 \
liborc-0.4.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libz.so.1 \
vips-modules-8.13"

inherit rpm
