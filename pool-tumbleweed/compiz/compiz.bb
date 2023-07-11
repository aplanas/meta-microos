SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-0.8.18-2.9.aarch64.rpm"
RPM_HASH = "b4c31e84f16a61151abbb75c75d50bd655169ed6ba8c74e68e56cac5d6f15b8505a51d849b55d38f62ff406fbdca2a39cd4575f1a13c213927520dc9e8e16310"

RPROVIDES:${PN} += "compiz \
windowmanager"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
compiz-branding \
compiz-decorator \
compiz-plugins \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libcompizconfig \
libm.so.6 \
libstartup-notification-1.so.0 \
libxml2.so.2 \
pciutils"

inherit rpm
