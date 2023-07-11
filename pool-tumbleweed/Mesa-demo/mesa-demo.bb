SUMMARY = "Mesa demo programs for the OpenGL stack"
DESCRIPTION = "Mesa is a 3-D graphics library with an API which is very similar to \
that of OpenGL.* To the extent that Mesa utilizes the OpenGL command \
syntax or state machine, it is being used with authorization from \
Silicon Graphics, Inc.(SGI). However, the author does not possess an \
OpenGL license from SGI, and makes no claim that Mesa is in any way a \
compatible replacement for OpenGL or associated with SGI. Those who \
want a licensed implementation of OpenGL should contact a licensed \
vendor. \
 \
Please do not refer to the library as MesaGL (for legal reasons). It's \
just Mesa or The Mesa 3-D graphics library. \
 \
This package contains the demos shipped with Mesa. \
 \
* OpenGL is a trademark of Silicon Graphics Incorporated."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-9.0.0-1.2.aarch64.rpm"
RPM_HASH = "caa4e5e3e3410f1872434a4f639bb1cdf86ee8c7bb988028b86290774810240386a342f5f9de9eb10a96bf3d252729e76f80dd9c929c2c9f0417d5733786007a"

RPROVIDES:${PN} += "Mesa-demo"

RDEPENDS:${PN} += "Mesa-demo-egl \
Mesa-demo-es \
Mesa-demo-x \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libOSMesa.so.8 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libglut.so.3 \
libm.so.6 \
libvulkan.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0"

inherit rpm
