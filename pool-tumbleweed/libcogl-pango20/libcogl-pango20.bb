SUMMARY = "Pango integration for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "libcogl-pango20-1.22.8-2.12.aarch64.rpm"
RPM_HASH = "742fa9cf8cc5f0e8d038c5b0fc1644e8abc6263b16cb59e085f25b87555a969b7c09a048fdd5ccd5c041eaca8931bba791a70f4b33564ac1178706404095457c"

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
