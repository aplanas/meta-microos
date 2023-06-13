SUMMARY = "Development files for an old API variant of wxWidgets"
DESCRIPTION = "wxWidgets is a C++ library for cross-platform GUI development. \
With wxWidgets, you can create applications for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source code. \
 \
This package contains all files needed for developing with wxGTK2. \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxWidgets-3_0-nostl/README.SUSE to pick a correct variant."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "wxWidgets-3_0-nostl-devel-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "bb319ba8eb3183f2608d42239ae375abd07d6176d5d9f9b6b5593583b05a85c3e7ec0003ffae40529ab014a7df4810a755e3656e0c8b1b033ebdb8fdbd218b1c"

RPROVIDES:${PN} += "wxWidgets-3_0-nostl-devel \
wxWidgets-3_0-nostl-devel(aarch-64) \
wxWidgets-any-devel"

RDEPENDS:${PN} += "/bin/sh \
gtk2-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse-nostl.so.3.0.5()(64bit) \
libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) \
libwx_baseu-suse-nostl3_0_5 \
libwx_baseu_net-suse-nostl3_0_5 \
libwx_baseu_xml-suse-nostl.so.3.0.5()(64bit) \
libwx_baseu_xml-suse-nostl.so.3.0.5(WXU_3.0)(64bit) \
libwx_baseu_xml-suse-nostl3_0_5 \
libwx_gtk2u_adv-suse-nostl3_0_5 \
libwx_gtk2u_aui-suse-nostl3_0_5 \
libwx_gtk2u_core-suse-nostl3_0_5 \
libwx_gtk2u_gl-suse-nostl3_0_5 \
libwx_gtk2u_html-suse-nostl3_0_5 \
libwx_gtk2u_media-suse-nostl3_0_5 \
libwx_gtk2u_propgrid-suse-nostl3_0_5 \
libwx_gtk2u_qa-suse-nostl3_0_5 \
libwx_gtk2u_ribbon-suse-nostl3_0_5 \
libwx_gtk2u_richtext-suse-nostl3_0_5 \
libwx_gtk2u_stc-suse-nostl3_0_5 \
libwx_gtk2u_xrc-suse-nostl3_0_5 \
pkgconfig(gl) \
pkgconfig(glu)"

inherit rpm
