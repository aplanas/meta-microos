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

PV = "23.1.4"

RPM_NAME = "Mesa-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "1fcb122e13ff8ff8e06026ae24516dd23749af290d28c2cbe9d71d7234baadf7c8ed59b40d503a5edc196c9770f73d70d454e9a07488e12dc1c1ed8688c1ca6b"

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
