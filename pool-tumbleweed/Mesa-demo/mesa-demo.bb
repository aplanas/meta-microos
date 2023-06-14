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

RPM_NAME = "Mesa-demo-9.0.0-1.1.aarch64.rpm"
RPM_HASH = "e9731d34bf6191bfed7ba51dd40524328f12f90e59cb193aaee53f6d9854f7bf1e6da7c4f3aaf9c7a53278fe676f2e4fa4375efc55debb3439a7ab45fff00a4c"

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
