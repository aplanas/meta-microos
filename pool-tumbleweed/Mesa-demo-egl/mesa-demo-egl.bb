SUMMARY = "EGL-based demos"
DESCRIPTION = "This package contains some common EGL-based demos."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-egl-9.0.0-1.1.aarch64.rpm"
RPM_HASH = "0d0930972e551d07b7b440c04b8aec9e09e8386535b944008f190e1edf7a51ff8af665e2b999c33507e911c36c46ea78a8c10b77e87e8dad36d522f4ed425cf7"

RPROVIDES:${PN} += "Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/eglgears-x11 \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/eglinfo \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/egltri-x11 \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/peglgears \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/xeglgears \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/xeglthreads \
Mesa-demo-egl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
