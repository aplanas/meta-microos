SUMMARY = "A library for wxWidgets support in Erlang"
DESCRIPTION = "A Graphics System used to write platform independent user interfaces."
LICENSE = "Apache-2.0"

PV = "25.3.2"

RPM_NAME = "erlang-wx-25.3.2-1.1.aarch64.rpm"
RPM_HASH = "a3e72064df6a8027e97d613b1696c729c2de05bb90b3b9b3b1a9f41b62a32d9bb4eba0bd9b34cff48f6a2e3dc72a6fc3ad9bc360b99c14fb9a8f0fe791be5b9d"

RPROVIDES:${PN} += "erlang-wx \
erlang-wx(aarch-64)"

RDEPENDS:${PN} += "erlang \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGLU.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk2u_aui-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_gl-suse.so.9.0.0()(64bit) \
libwx_gtk2u_gl-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_html-suse.so.9.0.0()(64bit) \
libwx_gtk2u_html-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_stc-suse.so.9.0.0()(64bit) \
libwx_gtk2u_stc-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_xrc-suse.so.9.0.0()(64bit) \
libwx_gtk2u_xrc-suse.so.9.0.0(WXU_3.2)(64bit) \
wxWidgets"

inherit rpm
