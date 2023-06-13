SUMMARY = "Nodebuilder for ZDoom"
DESCRIPTION = "ZDBSP is ZDoom's (internal and external) node builder. This node \
builder was written with two design goals in mind: speed and \
minimization of polyobject bleeding."
LICENSE = "GPL-2.0+"

PV = "1.19"

RPM_NAME = "zdbsp-1.19-1.25.aarch64.rpm"
RPM_HASH = "a546f7913a400002f4943664f0bed43db54b1479cda5f58eaa100cd87e3c94b541b65998262bb3893554223e69bd1b90a2d930adcb67ad71b8c588e9a83fa9ca"

RPROVIDES:${PN} += "zdbsp \
zdbsp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libz.so.1()(64bit)"

inherit rpm
