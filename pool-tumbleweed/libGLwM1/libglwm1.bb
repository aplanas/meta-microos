SUMMARY = "Motif OpenGL drawing area widget library"
DESCRIPTION = "Motif OpenGL drawing area widget library shipped by the Mesa Project."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "libGLwM1-8.0.0-7.3.aarch64.rpm"
RPM_HASH = "6ab040c396413cff3598f75712c56a5532580919edb419ea310b4b0aed8e7061bab06c91be470592d378da3dc3060d4c66ea2adbbbb370a254fcc6351a758a47"

RPROVIDES:${PN} += "GLw1 \
MesaGLw \
libGLw.so.1()(64bit) \
libGLwM1 \
libGLwM1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXm.so.4()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
openmotif"

inherit rpm
