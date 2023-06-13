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

PV = "23.0.3"

RPM_NAME = "Mesa-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "a37eb5959619c03b091759e35fd5b4c592b3ed12aa923245ae9c660d75804d41d199b012157d83fd95860c12733094916db131dd2c568d8f730444f1d4529f75"

RPROVIDES:${PN} += "Mesa-devel \
Mesa-devel(aarch-64) \
Mesa-devel-static \
Mesa-libIndirectGL-devel \
libtxc_dxtn-devel \
s2tc-devel \
xorg-x11-Mesa-devel"

RDEPENDS:${PN} += "Mesa \
Mesa-dri-devel \
Mesa-libEGL-devel \
Mesa-libGL-devel \
Mesa-libGLESv1_CM-devel \
Mesa-libGLESv2-devel \
Mesa-libglapi-devel \
libOSMesa-devel \
libgbm-devel \
libglvnd-devel"

inherit rpm
