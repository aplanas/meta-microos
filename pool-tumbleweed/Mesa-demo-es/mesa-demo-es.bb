SUMMARY = "GLES-based demos"
DESCRIPTION = "This package contains some common GLES-based demos."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-es-9.0.0-1.1.aarch64.rpm"
RPM_HASH = "3cd4e3dfa902e1422c51b1ab2de66391e48fec72398947f0ddbf5531f1111d3089f3fcc54bf62404ba30c1ae6beba37019959cc9de6b92ae7f407263fe2d96d5"

RPROVIDES:${PN} += "Mesa-demo-/usr/lib64/mesa-demos/egl/opengles2/es2-info \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengles2/es2gears-x11 \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengles2/es2tri \
Mesa-demo-es"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
