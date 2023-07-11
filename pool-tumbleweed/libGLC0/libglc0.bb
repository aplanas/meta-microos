SUMMARY = "Free OpenGL Character Renderer"
DESCRIPTION = "QuesoGLC is a free (as in free speech) implementation of the OpenGL \
Character Renderer (GLC). QuesoGLC is based on the FreeType library, \
provides Unicode support and is designed to be easily ported to any \
platform that supports both FreeType and the OpenGL API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libGLC0-0.7.2-3.7.aarch64.rpm"
RPM_HASH = "f357d9b136d42fae921649a7c344b9230167710694b69d9525ed3baaba7984b22ebd8076d080a291448b21b44982bd26e61bc65609c365b2f0e3a8dc8c41b1fa"

RPROVIDES:${PN} += "libGLC.so.0 \
libGLC0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libm.so.6"

inherit rpm
