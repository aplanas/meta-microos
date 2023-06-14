SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender. \
 \
COLLADAFramework is the datamodel used to load COLLADA files."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libOpenCOLLADAFramework0_3-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "ddd61cf4e51df0e221ac9c902d21c9c05b3b477dad350870c46cc6e62de55497edf07af2897125f31977e9ca039146a26390b6df521d538dd167b021c0ceca58"

RPROVIDES:${PN} += "libOpenCOLLADAFramework.so.0.3 \
libOpenCOLLADAFramework0-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCOLLADABaseUtils.so.0.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
