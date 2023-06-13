SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender. \
 \
COLLADABaseUtils is the package of utilitie used by many of the other \
projects."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libOpenCOLLADABaseUtils0_3-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "4a3216827c40d9dfa3f1399618bca07d3eb6a2026b7c3c7d51ec0c2d42292b5b2cdd195a938d535a13f205e9c19018074391f51cd53ef06be876aea2369ad6ea"

RPROVIDES:${PN} += "libOpenCOLLADABaseUtils.so.0.3()(64bit) \
libOpenCOLLADABaseUtils0_3 \
libOpenCOLLADABaseUtils0_3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libUTF.so.0.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpcre.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
