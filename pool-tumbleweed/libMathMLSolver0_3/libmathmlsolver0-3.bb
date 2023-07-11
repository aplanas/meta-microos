SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libMathMLSolver0_3-1.6.68-1.13.aarch64.rpm"
RPM_HASH = "adffbb33d708da272c6e7d03240585f271b79d8eaa744bc065abfdf0077ce82cf8385c89e2ca5bb9ff791c6306737a45ab0495adf99be31b0eac124ade0342b9"

RPROVIDES:${PN} += "libMathMLSolver.so.0.3 \
libMathMLSolver0-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
