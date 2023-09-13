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

PV = "23.1.7"

RPM_NAME = "Mesa-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "4a57772408914ce1d4578a8fd8a09e935c688b0732871136655818b24464159febdb803c66319034bd592590d874cdbbe3fa592abe79caa0868c07f2136bed2c"

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
