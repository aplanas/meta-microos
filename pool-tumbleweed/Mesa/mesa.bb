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

PV = "23.1.6"

RPM_NAME = "Mesa-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "ce21143f4b2c261a319ec298e370a2e2d694ffb7408232f187385e03198b3ef19cfd3deeea26aa421a15ab93bcab6a47e69c79264a4ffd7def060a5bada6c858"

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
