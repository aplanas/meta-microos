SUMMARY = "OpenGL ES 2 support for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures"
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "libcogl-gles2-20-1.22.8-2.12.aarch64.rpm"
RPM_HASH = "a56da18dcdfc3cf7f1e144bc5bd30a590fe96366f1e52a432a6054a2f241f8d7cab5394f20d795b7ff8c7f87fcd9b9418270086913b7b39f029a98743e9bf129"

RPROVIDES:${PN} += "libcogl-gles2-20 \
libcogl-gles2.so.20"

RDEPENDS:${PN} += "/sbin/ldconfig \
libcogl.so.20"

inherit rpm
