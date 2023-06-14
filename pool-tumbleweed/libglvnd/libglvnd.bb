SUMMARY = "The GL Vendor-Neutral Dispatch library"
DESCRIPTION = "Vendor-neutral dispatch layer for arbitrating OpenGL API calls between \
multiple vendors on a per-screen basis, as described by Andy Ritger's \
OpenGL ABI proposal."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libglvnd-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "bdadb99b1d9e855441440f5977e5b38d2cbb43d7ab6e1841636965dfabb2406e2394a0f044f45be5147c2502535c897ce02a320c331c131a2310bcc87e126a5e"

RPROVIDES:${PN} += "Mesa-libGLESv1-CM1 \
Mesa-libGLESv2-2 \
libEGL.so.1 \
libGL.so.1 \
libGLESv1-CM.so.1 \
libGLESv2.so.2 \
libGLX.so.0 \
libGLdispatch.so.0 \
libOpenGL.so.0 \
libglvnd \
libglvnd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
Mesa-dri \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
