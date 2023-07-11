SUMMARY = "Library for reading/writing/manipulating common animation particle"
DESCRIPTION = "C++ (with python bindings) library for easily reading/writing/manipulating \
common animation particle formats such as PDB, BGEO, PTC."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "partio-1.14.6-1.10.aarch64.rpm"
RPM_HASH = "a436ebfd5b07fbcae0566e1cfbb78c4468d8b4d282ebef115afa5e306117dff795ba3d626bf5393807fa7b5da18526422291de481a2b9d4aadbdde260423635e"

RPROVIDES:${PN} += "partio"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
libm.so.6 \
libpartio.so.1 \
libstdc++.so.6"

inherit rpm
