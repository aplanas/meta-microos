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

PV = "23.1.5"

RPM_NAME = "Mesa-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "b21ea59fa6fa41b9d44b95adefaf9c6751a76fe8c745575a2d1568f98275e54d6743790ff8ddd60eaa95cef1086bb77a84c6be2c1c96498d2b1f4758b2dc6f2d"

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
