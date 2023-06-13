SUMMARY = "Python bindings for libArcus"
DESCRIPTION = "Python bindings for the Arcus communication library."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "python3-Arcus-4.13.1-3.12.aarch64.rpm"
RPM_HASH = "bf92b6628466c99bd202867c148f0292dddde4e58576ea9f1100a60ab58e02b6cb29e0c4257c8063e1dbc87b944d6aae9dc70feb3674a4aba8c3db72be9d2485"

RPROVIDES:${PN} += "python3-Arcus \
python3-Arcus(aarch-64) \
python3.10dist(arcus) \
python3dist(arcus)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libArcus-Ultimaker \
libArcus.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
python(abi) \
python3-qt5-sip"

inherit rpm
