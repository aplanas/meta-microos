SUMMARY = "Lua plugin for librime"
DESCRIPTION = "Lua plugin for librime."
LICENSE = "SUSE-Permissive"

PV = "0.0.0+git20211220.8b37d55"

RPM_NAME = "librime-lua-0.0.0+git20211220.8b37d55-2.10.aarch64.rpm"
RPM_HASH = "efa8fba50b5613bddb47d7806fb596129b808f247f7e2fa319b68d38772755b3f8980759862908af3330677a9d5f5e0b32b316d21872c76a768d67ced6714487"

RPROVIDES:${PN} += "librime-lua \
librime-lua(aarch-64) \
librime-lua.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglog.so.0()(64bit) \
liblua5.4.so.5()(64bit) \
libopencc.so.1.1()(64bit) \
librime.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
