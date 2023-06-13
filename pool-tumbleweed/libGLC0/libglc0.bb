SUMMARY = "Free OpenGL Character Renderer"
DESCRIPTION = "QuesoGLC is a free (as in free speech) implementation of the OpenGL \
Character Renderer (GLC). QuesoGLC is based on the FreeType library, \
provides Unicode support and is designed to be easily ported to any \
platform that supports both FreeType and the OpenGL API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libGLC0-0.7.2-3.6.aarch64.rpm"
RPM_HASH = "5673745ed4f48140ff8c86bf2be9d3242f1235255703a7d2e1a634f31bb82623db61b84b9b7242df1805dc50497655d229f303ad2f95ac53831dd45332b02da2"

RPROVIDES:${PN} += "libGLC.so.0()(64bit) \
libGLC0 \
libGLC0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libfribidi.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
