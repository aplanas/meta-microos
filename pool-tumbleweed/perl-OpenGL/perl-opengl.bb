SUMMARY = "Perl bindings to the OpenGL API, GLU, and GLUT/FreeGLUT"
DESCRIPTION = "Perl bindings to the OpenGL API, GLU, and GLUT/FreeGLUT"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.70"

RPM_NAME = "perl-OpenGL-0.70-2.29.aarch64.rpm"
RPM_HASH = "e61eb45b15363119a682a65fcdce774d72db3640e3d8800a599df28980f8a53aa5990cec6a659f574f70131e7aa0486467c3f7006b75c71aa784dfe35fd841f5"

RPROVIDES:${PN} += "perl-OpenGL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libc.so.6 \
libglut.so.3 \
libm.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
