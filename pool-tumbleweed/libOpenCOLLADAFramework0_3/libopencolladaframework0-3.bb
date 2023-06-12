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

RPROVIDES:${PN} += "libOpenCOLLADAFramework.so.0.3()(64bit) \
libOpenCOLLADAFramework0_3 \
libOpenCOLLADAFramework0_3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libOpenCOLLADABaseUtils.so.0.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
