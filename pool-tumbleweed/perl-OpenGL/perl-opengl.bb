SUMMARY = "Perl bindings to the OpenGL API, GLU, and GLUT/FreeGLUT"
DESCRIPTION = "Perl bindings to the OpenGL API, GLU, and GLUT/FreeGLUT"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.70"

RPM_NAME = "perl-OpenGL-0.70-2.30.aarch64.rpm"
RPM_HASH = "6527d5ded96ee8f124125414098e544bb035bf07163878bce729ecf1b6f8eb0b26fb5e433222d9b14752602bcf0ffe127eec0817fcc0770215c985b9d789d817"

RPROVIDES:${PN} += "perl-OpenGL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libc.so.6 \
libglut.so.3 \
libm.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
