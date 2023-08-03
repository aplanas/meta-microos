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

RPM_NAME = "glu-devel-9.0.3-1.1.aarch64.rpm"
RPM_HASH = "43669686aea7c3fc6e9f2aa02eba1c369953f77ff5e290b0cd995be6a42c9630452b45c5900595c56c0abcc88a2cb908f2cf34674204eaff6234e28714760d57"

RPROVIDES:${PN} += "Mesa-libGLU-devel \
glu-devel \
pkgconfig-glu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libGLU1 \
pkgconfig-opengl"

inherit rpm
