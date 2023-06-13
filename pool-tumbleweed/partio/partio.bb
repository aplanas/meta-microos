SUMMARY = "Library for reading/writing/manipulating common animation particle"
DESCRIPTION = "C++ (with python bindings) library for easily reading/writing/manipulating \
common animation particle formats such as PDB, BGEO, PTC."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "partio-1.14.6-1.9.aarch64.rpm"
RPM_HASH = "37f55efbdf8fa287d6e80af706cb0cf39411d10e5f4544f664470b34b96390cccb66363427e600c85d03276098d92f23f46f4650f843e58a1ae0d37f13a15764"

RPROVIDES:${PN} += "partio \
partio(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libGLU.so.1()(64bit) \
libGLX.so.0()(64bit) \
libOpenGL.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglut.so.3()(64bit) \
libm.so.6()(64bit) \
libpartio.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
