SUMMARY = "System for rendering 3-D graphics"
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
* OpenGL is a trademark of Silicon Graphics Incorporated."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "8adecf874b22f5cf4b78f4790642b3a3f6843ebcde88a750826ab91354a9e760b875e9aa21be4d31088e2e4ee6107703df013ca73ee0f015bc2843eab4d1fa18"

RPROVIDES:${PN} += "Mesa \
Mesa-libIndirectGL1 \
Mesa-nouveau3d \
Mesa7 \
intel-i810-Mesa \
libXvMC-nouveau \
libXvMC-r600 \
libtxc-dxtn \
s2tc \
xorg-x11-Mesa"

RDEPENDS:${PN} += "/sbin/ldconfig \
Mesa-dri \
Mesa-gallium \
Mesa-libEGL1 \
Mesa-libGL1 \
libglvnd"

inherit rpm
