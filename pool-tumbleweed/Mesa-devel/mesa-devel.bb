SUMMARY = "Libraries, includes and more to develop Mesa applications"
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

RPM_NAME = "Mesa-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "b0d3ec70705e0293f54ad37d82f9f2589aeb0237ffd4ac775b825ed9e923f21e4f629916ac9d46f3dba20973db284f53cc422b510bbd0176442b17d060ce2166"

RPROVIDES:${PN} += "Mesa-devel \
Mesa-devel-static \
Mesa-libIndirectGL-devel \
libtxc-dxtn-devel \
s2tc-devel \
xorg-x11-Mesa-devel"

RDEPENDS:${PN} += "Mesa \
Mesa-dri-devel \
Mesa-libEGL-devel \
Mesa-libGL-devel \
Mesa-libGLESv1-CM-devel \
Mesa-libGLESv2-devel \
Mesa-libglapi-devel \
libOSMesa-devel \
libgbm-devel \
libglvnd-devel"

inherit rpm
