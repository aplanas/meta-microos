SUMMARY = "EGL-based demos"
DESCRIPTION = "This package contains some common EGL-based demos."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-egl-9.0.0-1.2.aarch64.rpm"
RPM_HASH = "68079b560dbe264572eacf6bccbed4ab2fd94ffa1acfcc4dd26d95bcd81d55c5b647e1cb3d2860ebbaab53e382c48da9226c393754de87cdc516c4bbc4c29fb6"

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
