SUMMARY = "Development files for wxWidgets-3_2-nostl"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains all files needed for developing with wxWidgets-3_2-nostl. \
This variant of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API. \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxWidgets-3_2-nostl/README.SUSE to pick a correct variant."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxWidgets-3_2-nostl-devel-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "349711a52338dfec31624d09ab1699033d2f2c1377c07e1c28ed69f1666c6e827321e0a18b8ed1ecbe85fdd2ea05c3b7ed064ff8af115615cac8f29c90ded85c"

RPROVIDES:${PN} += "wxWidgets-3_2-nostl-devel \
wxWidgets-3_2-nostl-devel(aarch-64) \
wxWidgets-any-devel"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_base-suse-nostl-devel \
libwx_baseu-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_xml-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu_xml-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_adv-suse-nostl9_0_0 \
libwx_gtk3u_aui-suse-nostl9_0_0 \
libwx_gtk3u_core-suse-nostl9_0_0 \
libwx_gtk3u_gl-suse-nostl9_0_0 \
libwx_gtk3u_html-suse-nostl9_0_0 \
libwx_gtk3u_media-suse-nostl9_0_0 \
libwx_gtk3u_propgrid-suse-nostl9_0_0 \
libwx_gtk3u_qa-suse-nostl9_0_0 \
libwx_gtk3u_ribbon-suse-nostl9_0_0 \
libwx_gtk3u_richtext-suse-nostl9_0_0 \
libwx_gtk3u_stc-suse-nostl9_0_0 \
libwx_gtk3u_xrc-suse-nostl9_0_0 \
pkgconfig(gl) \
pkgconfig(glu) \
pkgconfig(gtk+-3.0)"

inherit rpm
