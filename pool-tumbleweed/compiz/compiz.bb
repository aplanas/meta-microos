SUMMARY = "OpenGL window and compositing manager"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-0.8.18-2.8.aarch64.rpm"
RPM_HASH = "faeae3a9feac2c8f415ea09f31a19f83b1675280105f5f1476094447b9e4535aa16a78c5778d93cce1a1ad32d583c4a2ee7317b1cda130c93ba93d939f905d12"

RPROVIDES:${PN} += "application() \
application(compiz.desktop) \
compiz \
compiz(aarch-64) \
windowmanager"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
compiz-branding \
compiz-decorator \
compiz-plugins \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXcursor.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcompizconfig \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstartup-notification-1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
pciutils"

inherit rpm
