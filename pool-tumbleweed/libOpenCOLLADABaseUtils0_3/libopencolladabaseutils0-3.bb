SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender. \
 \
COLLADABaseUtils is the package of utilitie used by many of the other \
projects."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libOpenCOLLADABaseUtils0_3-1.6.68-1.13.aarch64.rpm"
RPM_HASH = "19a0f71faf092635362860b6b4e94634d8dff25caf63b63c687a0ae82b0f5608ec42b103e9ee2f267acb708487b348457838a11127eaafad7a9facb3e27b39e9"

RPROVIDES:${PN} += "libOpenCOLLADABaseUtils.so.0.3 \
libOpenCOLLADABaseUtils0-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libUTF.so.0.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre.so.1 \
libstdc++.so.6"

inherit rpm
