SUMMARY = "An implementation of the GDAL data model"
DESCRIPTION = "KEALib provides an implementation of the GDAL data model."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libkea1_5-1.5.0-2.3.aarch64.rpm"
RPM_HASH = "9c2152e399a905a78aa6d26e072da2c4b8b6851d1857562c6115d11d8598dc6669c03b30db5eaaca21154721ce4b324905f1cb80c41aae0050d1bce94e6c7df2"

RPROVIDES:${PN} += "libkea.so.1.5()(64bit) \
libkea1_5 \
libkea1_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_cpp.so.200()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
