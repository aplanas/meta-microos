SUMMARY = "Perl bindings to the OpenGL API, GLU, and GLUT/FreeGLUT"
DESCRIPTION = "Perl bindings to the OpenGL API, GLU, and GLUT/FreeGLUT"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.70"

RPM_NAME = "perl-OpenGL-0.70-2.28.aarch64.rpm"
RPM_HASH = "98cc8c69d4d838140f534bba550df33dd3b51a245c3e6ad44168db100a338d36916adbe2eb4d01828f2394e79a6d883fe7df02515271ee78eb6bf86968b9545e"

RPROVIDES:${PN} += "perl(OpenGL) \
perl-OpenGL \
perl-OpenGL(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglut.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
