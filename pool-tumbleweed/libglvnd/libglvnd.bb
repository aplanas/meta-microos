SUMMARY = "The GL Vendor-Neutral Dispatch library"
DESCRIPTION = "Vendor-neutral dispatch layer for arbitrating OpenGL API calls between \
multiple vendors on a per-screen basis, as described by Andy Ritger's \
OpenGL ABI proposal."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libglvnd-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "d1468172699814010b0c5eee93be65a025606e88cb31f5c13903ab2321575249e041cfccabe4f1ae73478123e29762e9716a677ea1154da8ce99022bf0383b53"

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
