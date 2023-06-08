SUMMARY = "A library for wxWidgets support in Erlang"
DESCRIPTION = "A Graphics System used to write platform independent user interfaces."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-wx-25.3-1.1.aarch64.rpm"
RPM_HASH = "ea64dcab4523a078c1b29d035e813c80b710342e7bf84ac9b24bd0012372c1e5a69dce1e861deda8355ad17372d85b50515419a20848ac12d3b40b14ade2b8ff"

RPROVIDES:${PN} += "erlang-wx erlang-wx(aarch-64)"
RDEPENDS:${PN} += "erlang ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGLU.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.8.0.0()(64bit) libwx_baseu-suse.so.8.0.0(WXU_3.2)(64bit) libwx_gtk2u_aui-suse.so.8.0.0()(64bit) libwx_gtk2u_aui-suse.so.8.0.0(WXU_3.2)(64bit) libwx_gtk2u_core-suse.so.8.0.0()(64bit) libwx_gtk2u_core-suse.so.8.0.0(WXU_3.2)(64bit) libwx_gtk2u_gl-suse.so.8.0.0()(64bit) libwx_gtk2u_gl-suse.so.8.0.0(WXU_3.2)(64bit) libwx_gtk2u_html-suse.so.8.0.0()(64bit) libwx_gtk2u_html-suse.so.8.0.0(WXU_3.2)(64bit) libwx_gtk2u_stc-suse.so.8.0.0()(64bit) libwx_gtk2u_stc-suse.so.8.0.0(WXU_3.2)(64bit) libwx_gtk2u_xrc-suse.so.8.0.0()(64bit) libwx_gtk2u_xrc-suse.so.8.0.0(WXU_3.2)(64bit) wxWidgets"

inherit rpm
