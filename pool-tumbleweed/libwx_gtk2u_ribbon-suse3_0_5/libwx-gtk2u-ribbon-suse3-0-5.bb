SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_ribbon-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "4e3ca0acbf0375e700c23a71f92d02ab01eab84204d9ca0e1b0eac73b160727cffb70886cbd11c3fef15eea6e4c7504e80f9838b679a2cb8cac7f8edb5019dfc"

RPROVIDES:${PN} += "libwx_gtk2u_ribbon-suse.so.3.0.5()(64bit) \
libwx_gtk2u_ribbon-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_ribbon-suse.so.3.0.5(WXU_3.0.1)(64bit) \
libwx_gtk2u_ribbon-suse.so.3.0.5(WXU_3.0.2)(64bit) \
libwx_gtk2u_ribbon-suse.so.3.0.5(WXU_3.0.3)(64bit) \
libwx_gtk2u_ribbon-suse.so.3.0.5(WXU_3.0.4)(64bit) \
libwx_gtk2u_ribbon-suse.so.3.0.5(WXU_3.0.5)(64bit) \
libwx_gtk2u_ribbon-suse3_0_5 \
libwx_gtk2u_ribbon-suse3_0_5(aarch-64)"
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
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_core-suse.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm