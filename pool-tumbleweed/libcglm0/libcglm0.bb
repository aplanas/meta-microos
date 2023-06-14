SUMMARY = "OpenGL mathematics (glm) for C"
DESCRIPTION = "cglm is a C99-compatible version of the previous OpenGL Mathematics \
(GLM) implementation, a mathematics library for graphics software \
based on the OpenGL Shading Language (GLSL) specifications."
LICENSE = "MIT"

PV = "0.8.9"

RPM_NAME = "libcglm0-0.8.9-1.3.aarch64.rpm"
RPM_HASH = "d104ecd892ebae682dd4057dc4fbe31e714cccc820f6dfbfdc81a6c1a7c6a04d783950c859d9bb53998f4828166dbc95c93ecba2ec71ec780f8a27cef7b88607"

RPROVIDES:${PN} += "libcglm.so.0 \
libcglm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
