SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_stc-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "c848dedab605fbb5d6778aa2d2529f6bd344bbaaaad209804c7c12f23c2502e45e19880364e33ec0a9b3b1085c8f77b26dc26a97b965eb58ae165da314bcd66a"

RPROVIDES:${PN} += "libwx_gtk2u_stc-suse.so.3.0.5()(64bit) \
libwx_gtk2u_stc-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_stc-suse.so.3.0.5(WXU_3.0.1)(64bit) \
libwx_gtk2u_stc-suse.so.3.0.5(WXU_3.0.2)(64bit) \
libwx_gtk2u_stc-suse.so.3.0.5(WXU_3.0.3)(64bit) \
libwx_gtk2u_stc-suse.so.3.0.5(WXU_3.0.4)(64bit) \
libwx_gtk2u_stc-suse.so.3.0.5(WXU_3.0.5)(64bit) \
libwx_gtk2u_stc-suse3_0_5 \
libwx_gtk2u_stc-suse3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_core-suse.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm