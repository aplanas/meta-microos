SUMMARY = "XML-RPC library for Qt"
DESCRIPTION = "libmaia is a XML-RPC library for Qt."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "libmaia1-0.9.0-1.25.aarch64.rpm"
RPM_HASH = "75d9d942215ca8fcb5d3427fa596b0df2d5a45286eca85b252fc06e97420e16a8256d422c677f0f82ade511e68a66437476e6682adf58dc9e9bf276ab073b0a8"

RPROVIDES:${PN} += "libmaia.so.1()(64bit) \
libmaia1 \
libmaia1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
