SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_ribbon-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "28ccbe743c73e900dfe19496152e2cd00e698f1b4a66e5b8926fcd9731f45a0d7b1d2f8bf3e54e4f9bc6e0a91c527fd8d2eaaba8d8909557be307f9daf682269"

RPROVIDES:${PN} += "libwx_gtk3u_ribbon-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_ribbon-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_ribbon-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_gtk3u_ribbon-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) \
libwx_gtk3u_ribbon-suse-nostl9_0_0 \
libwx_gtk3u_ribbon-suse-nostl9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
