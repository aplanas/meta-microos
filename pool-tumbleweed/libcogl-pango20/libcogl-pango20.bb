SUMMARY = "Pango integration for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "libcogl-pango20-1.22.8-2.11.aarch64.rpm"
RPM_HASH = "487d351910e347600a749b4baacbd6eedc648bd451c59c189240c46128fc5b363a4a35e72ab29fa17627d35452aba3bb9ef6a4a1505d0f1512c143800e2c9290"

RPROVIDES:${PN} += "libcogl-pango.so.20 \
libcogl-pango20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcogl.so.20 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
