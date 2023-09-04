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

RPM_NAME = "libGLU1-9.0.3-2.1.aarch64.rpm"
RPM_HASH = "f1cfb167af05f232698a157454bf00d37b2e837540eece7a26d63ddf169f2c1bf36492e4ad7fe36be298bf63014197889c3b52bc7960707ce60bd6c804a23333"

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
