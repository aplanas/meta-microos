SUMMARY = "Development files for the GLU API"
DESCRIPTION = "GLU offers simple interfaces for building mipmaps; checking for the \
presence of extensions in the OpenGL (or other libraries which follow \
the same conventions for advertising extensions); drawing \
piecewise-linear curves, NURBS, quadrics and other primitives \
(including, but not limited to, teapots); tesselating surfaces; \
setting up projection matrices and unprojecting screen coordinates to \
world coordinates. \
 \
This package contains includes headers and static libraries for \
compiling programs with GLU."
LICENSE = "SGI-B-2.0"

PV = "9.0.3"

RPM_NAME = "glu-devel-9.0.3-2.1.aarch64.rpm"
RPM_HASH = "f0aaab5653a79beb958e45f6044821f177ed373f53584801feea40e6e6a5b3f68675d46bb1faaf22252c5360a1e021c29ca87ebbbbe0d60636956a4086ad75e8"

RPROVIDES:${PN} += "Mesa-libGLU-devel \
glu-devel \
pkgconfig-glu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libGLU1 \
pkgconfig-gl \
pkgconfig-opengl"

inherit rpm
