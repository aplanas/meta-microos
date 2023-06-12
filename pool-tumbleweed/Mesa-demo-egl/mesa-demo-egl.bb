SUMMARY = "EGL-based demos"
DESCRIPTION = "This package contains some common EGL-based demos."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-egl-9.0.0-1.1.aarch64.rpm"
RPM_HASH = "0d0930972e551d07b7b440c04b8aec9e09e8386535b944008f190e1edf7a51ff8af665e2b999c33507e911c36c46ea78a8c10b77e87e8dad36d522f4ed425cf7"

RPROVIDES:${PN} += "Mesa-demo-egl \
Mesa-demo-egl(aarch-64) \
Mesa-demo:/usr/lib64/mesa-demos/egl/opengl/eglgears_x11 \
Mesa-demo:/usr/lib64/mesa-demos/egl/opengl/eglinfo \
Mesa-demo:/usr/lib64/mesa-demos/egl/opengl/egltri_x11 \
Mesa-demo:/usr/lib64/mesa-demos/egl/opengl/peglgears \
Mesa-demo:/usr/lib64/mesa-demos/egl/opengl/xeglgears \
Mesa-demo:/usr/lib64/mesa-demos/egl/opengl/xeglthreads"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
