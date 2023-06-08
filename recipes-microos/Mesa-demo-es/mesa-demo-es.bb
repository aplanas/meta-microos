SUMMARY = "GLES-based demos"
DESCRIPTION = "This package contains some common GLES-based demos."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-es-9.0.0-1.1.aarch64.rpm"
RPM_HASH = "3cd4e3dfa902e1422c51b1ab2de66391e48fec72398947f0ddbf5531f1111d3089f3fcc54bf62404ba30c1ae6beba37019959cc9de6b92ae7f407263fe2d96d5"

RPROVIDES:${PN} += "Mesa-demo-es Mesa-demo-es(aarch-64) Mesa-demo:/usr/lib64/mesa-demos/egl/opengles2/es2_info Mesa-demo:/usr/lib64/mesa-demos/egl/opengles2/es2gears_x11 Mesa-demo:/usr/lib64/mesa-demos/egl/opengles2/es2tri"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGLESv2.so.2()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
