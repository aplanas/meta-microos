SUMMARY = "The GL/GLX runtime of the Mesa 3D graphics library"
DESCRIPTION = "Mesa is a software library for 3D computer graphics that provides a \
generic OpenGL implementation for rendering three-dimensional \
graphics. \
 \
GLX ('OpenGL Extension to the X Window System') provides the \
interface connecting OpenGL and the X Window System: it enables \
programs wishing to use OpenGL to do so within a window provided by \
the X Window System."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-libGL1-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "824d142e5e0cb64784a0a003230082abbc35c6562f3417d5b6b3c58eaf6896bc2ce5ae4b658f861a76b6479f1d2665626b334247cc1229919d0768e895f11cfc"

RPROVIDES:${PN} += "Mesa-libGL1 \
libGLX-mesa.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
Mesa \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXxf86vm.so.1 \
libc.so.6 \
libdrm.so.2 \
libglapi.so.0 \
libglvnd \
libm.so.6 \
libxcb-dri2.so.0 \
libxcb-dri3.so.0 \
libxcb-glx.so.0 \
libxcb-present.so.0 \
libxcb-randr.so.0 \
libxcb-shm.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
libxshmfence.so.1"

inherit rpm
