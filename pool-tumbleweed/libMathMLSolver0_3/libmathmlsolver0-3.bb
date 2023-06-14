SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libMathMLSolver0_3-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "c74e3485fda7cd8a6a8f028046904266bc78216545c80c1552eef4610ab96b218227155f792a6eec6362565980e0cbd45f46a34464a86fbe9372375720a4f348"

RPROVIDES:${PN} += "libMathMLSolver.so.0.3 \
libMathMLSolver0-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
