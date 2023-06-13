SUMMARY = "Track the Dependencies in your C or C++ Code"
DESCRIPTION = "Idep can be used for checking the dependencies of C++ include files. It \
offers these features: \
 \
- Prints out hierarchy of include files \
 \
- Lists the class definitions that are found in each header file \
 \
- Detects cyclic dependencies in your include files \
 \
- Detects inclusions that could be pruned"
LICENSE = "GPL-2.0-or-later"

PV = "0.5"

RPM_NAME = "idep-0.5-164.12.aarch64.rpm"
RPM_HASH = "b18855893e114457f2a024adfe7c262f81f09e5db10315f315a157ec3c70a06814acf3ae5e2c1329e0c69d71b2b99c54f554077e7977a4f7d310e4af835653c3"

RPROVIDES:${PN} += "idep \
idep(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
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
