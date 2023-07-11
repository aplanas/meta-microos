SUMMARY = "Thin type layer for graphic libraries"
DESCRIPTION = "When creating graphic libraries you most likely end up dealing with points \
and rectangles. If you're particularly unlucky, you may end up dealing \
with affine matrices and 2D transformations. If you're writing a graphic \
library with 3D transformations, though, you are going to hit the jackpot: \
4x4 matrices, projections, transformations, vectors, and quaternions. \
 \
This library provides types and their relative API; it does not deal with \
windowing system surfaces, drawing, scene graphs, or input. You're \
supposed to do that yourself, in your own canvas implementation, which is \
the whole point of writing the library in the first place."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "libgraphene-1_0-0-1.10.8-1.8.aarch64.rpm"
RPM_HASH = "7496ee4ef6afed660dc839b2f5cdebaf6118c185090a5d8a63f99eb28d587fac0f36addee3b7fcb1e563036b15bdc584a15c9b895e24d2a0d0534bd8bd5afdf1"

RPROVIDES:${PN} += "libgraphene-1-0-0 \
libgraphene-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
