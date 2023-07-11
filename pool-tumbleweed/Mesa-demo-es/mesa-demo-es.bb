SUMMARY = "GLES-based demos"
DESCRIPTION = "This package contains some common GLES-based demos."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-es-9.0.0-1.2.aarch64.rpm"
RPM_HASH = "53c2b346f28d23884c1ebe37dfae908056325524df23cbcbcaab7d177fad0a80a05f02064f4141888199790c97d44f19500a4ef9c2fd9ba54c9291a4b04659d3"

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
