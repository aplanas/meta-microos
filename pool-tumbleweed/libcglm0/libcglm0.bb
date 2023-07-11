SUMMARY = "OpenGL mathematics (glm) for C"
DESCRIPTION = "cglm is a C99-compatible version of the previous OpenGL Mathematics \
(GLM) implementation, a mathematics library for graphics software \
based on the OpenGL Shading Language (GLSL) specifications."
LICENSE = "MIT"

PV = "0.8.9"

RPM_NAME = "libcglm0-0.8.9-1.4.aarch64.rpm"
RPM_HASH = "b6cf26ce8757fb4e420480cb52e0a20c275e1d44b88a2a005d5b3af6fa0adbf63a2b91d6e830000975aa634940ce44f1c2388a5fb5854c896900c2d8b4658e7c"

RPROVIDES:${PN} += "libcglm.so.0 \
libcglm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
