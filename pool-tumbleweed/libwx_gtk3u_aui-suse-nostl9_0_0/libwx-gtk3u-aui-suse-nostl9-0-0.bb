SUMMARY = "wxWidgets advanced user interface docking library"
DESCRIPTION = "The Advanced User Interface docking library of wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_aui-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "890329110112106d042e014803b68f82d922813aa47b35cfdcbfb2ede4febf4c860c0400f19a5321e25f11ac78392e19841e365d5e8b48ad98fced0e1a296a98"

RPROVIDES:${PN} += "libwx_gtk3u_aui-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_aui-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_aui-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_gtk3u_aui-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) \
libwx_gtk3u_aui-suse-nostl9_0_0 \
libwx_gtk3u_aui-suse-nostl9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
