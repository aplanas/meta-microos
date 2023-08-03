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

PV = "9.0.3"

RPM_NAME = "libGLU1-9.0.3-1.1.aarch64.rpm"
RPM_HASH = "44187730613f944aa430c108ba180d23cd77654ae4cc2536abbd2d58e48189a2b80927c741021ac68f699e47e62bab2c7ae71fb80935c985e349fe3b64eb76b0"

RPROVIDES:${PN} += "Mesa-libGLU1 \
libGLU.so.1 \
libGLU1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
