SUMMARY = "OpenGL utility library"
DESCRIPTION = "GLU offers simple interfaces for building mipmaps; checking for the \
presence of extensions in the OpenGL (or other libraries which follow \
the same conventions for advertising extensions); drawing \
piecewise-linear curves, NURBS, quadrics and other primitives \
(including, but not limited to, teapots); tesselating surfaces; \
setting up projection matrices and unprojecting screen coordinates to \
world coordinates. \
 \
This package provides the SGI implementation of GLU previously shipped \
with Mesa, but meanwhile developed separately."
LICENSE = "SGI-B-2.0"

PV = "9.0.2"

RPM_NAME = "libGLU1-9.0.2-2.4.aarch64.rpm"
RPM_HASH = "e3afc21b4f817f88af94a1ed69ec2cd23aac6288eb898b705403fc3aa26e0dcebe10e8ef5843458474a430d70010fb11c3219aa739a3dd72771492ba48bc88d6"

RPROVIDES:${PN} += "Mesa-libGLU1 \
libGLU.so.1 \
libGLU1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
