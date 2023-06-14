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

PV = "23.0.3"

RPM_NAME = "Mesa-libGL1-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "06156a25b21fd24b89b615e03403e651e0aa13b89074b7ffdadc4bedfe556dd4e7051d95f30c3931a986c70955a015b468d12521eed1b9cfd0743bb29fad76c8"

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
