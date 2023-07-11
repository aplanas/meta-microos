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

PV = "9.0.2"

RPM_NAME = "glu-devel-9.0.2-2.4.aarch64.rpm"
RPM_HASH = "a4b6d7bbc1a53241efda0b092932018464444b366f15529e57b13df8d6ef09f71bb468b02b68b648ace973635662dac35a82e7b49b5cbe8c25bbadb92e5e1c65"

RPROVIDES:${PN} += "Mesa-libGLU-devel \
glu-devel \
pkgconfig-glu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libGLU1 \
pkgconfig-gl"

inherit rpm
