SUMMARY = "wxWidgets networking library"
DESCRIPTION = "Classes for network access with wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_baseu_net-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "ab9665e16102c465e6bf2eb90626e59123d589fe3cc5b86cf10a967aa7c17f90a723800579eceb4d94e26501602e4be833f16aa74026dcde6d842c807d597212"

RPROVIDES:${PN} += "libwx_baseu_net-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu_net-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_net-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_baseu_net-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) \
libwx_baseu_net-suse-nostl9_0_0 \
libwx_baseu_net-suse-nostl9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
