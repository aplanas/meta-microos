SUMMARY = "Tool for storage management"
DESCRIPTION = "barrel is a command line tool for storage management."
LICENSE = "GPL-2.0-only"

PV = "0.2.0"

RPM_NAME = "barrel-0.2.0-1.3.aarch64.rpm"
RPM_HASH = "a81baebda7182b2061a97bebb3896582d3d670af6141ab4e06d13d38f3265e2cde6a0eced0497d017e9cb233967caa866a430e7b21da4d4d19f85c66682c8585"

RPROVIDES:${PN} += "barrel \
barrel(aarch-64) \
config(barrel)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libstorage-ng.so.1()(64bit) \
libstorage-ng1"

inherit rpm
