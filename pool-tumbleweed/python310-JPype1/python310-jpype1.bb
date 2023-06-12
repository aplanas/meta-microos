SUMMARY = "Python to Java bridge"
DESCRIPTION = "A Python to Java bridge."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python310-JPype1-1.4.1-1.4.aarch64.rpm"
RPM_HASH = "9479764e71197c19a1894c7790cd9aa2b648d52e0bef6ef5af1e77bb4e915a0efbcf3d4fd9cecf2ccff2eead6626293c9313f8efd05bffbcc2184314830e908b"

RPROVIDES:${PN} += "python3-JPype1 \
python3.10dist(jpype1) \
python310-JPype1 \
python310-JPype1(aarch-64) \
python3dist(jpype1)"
RDEPENDS:${PN} += "java-15-openjdk-headless \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi)"

inherit rpm
