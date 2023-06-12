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

PV = "23.0.3"

RPM_NAME = "Mesa-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "86102fa7b56acb9db8a168ef5b8f2bc5de85751adca60991f82cc2fb559760bbffc5e2f8b33469232a5f1cfc14b5dbf0ff0b58f8d0e7e924a7a6765c1f198bbb"

RPROVIDES:${PN} += "Mesa \
Mesa(aarch-64) \
Mesa-libIndirectGL1 \
Mesa-nouveau3d \
Mesa7 \
intel-i810-Mesa \
libXvMC_nouveau \
libXvMC_r600 \
libtxc_dxtn \
s2tc \
xorg-x11-Mesa"
RDEPENDS:${PN} += "/sbin/ldconfig \
Mesa-dri \
Mesa-gallium \
Mesa-libEGL1 \
Mesa-libGL1 \
libglvnd"

inherit rpm
