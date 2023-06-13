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
Mesa-libGL1(aarch-64) \
libGLX_mesa.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
Mesa \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXxf86vm.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libglapi.so.0()(64bit) \
libglvnd \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libxcb-dri2.so.0()(64bit) \
libxcb-dri3.so.0()(64bit) \
libxcb-glx.so.0()(64bit) \
libxcb-present.so.0()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb-sync.so.1()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxshmfence.so.1()(64bit)"

inherit rpm
