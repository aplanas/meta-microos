SUMMARY = "Development files for GTK2-backed wxWidgets 3.0"
DESCRIPTION = "wxWidgets is a C++ library for cross-platform GUI development. \
With wxWidgets, you can create applications for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source code. \
 \
This package contains all files needed for developing with wxGTK2. \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxWidgets-3_0/README.SUSE to pick a correct variant."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "wxWidgets-3_0-devel-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "e359f3a3260c919a78edd6a67c525e9bce20a12d2dcf03c5716cf5e365456e71199bf9eee34da726b30189e306cb96c67fd748d546e73f3f89f07ad7c7430373"

RPROVIDES:${PN} += "wxGTK-devel \
wxGTK2-devel \
wxWidgets-3_0-devel \
wxWidgets-3_0-devel(aarch-64) \
wxWidgets-any-devel \
wxWidgets-devel"

RDEPENDS:${PN} += "/bin/sh \
gtk2-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_baseu-suse3_0_5 \
libwx_baseu_net-suse3_0_5 \
libwx_baseu_xml-suse.so.3.0.5()(64bit) \
libwx_baseu_xml-suse3_0_5 \
libwx_gtk2u_adv-suse3_0_5 \
libwx_gtk2u_aui-suse3_0_5 \
libwx_gtk2u_core-suse3_0_5 \
libwx_gtk2u_gl-suse3_0_5 \
libwx_gtk2u_html-suse3_0_5 \
libwx_gtk2u_media-suse3_0_5 \
libwx_gtk2u_propgrid-suse3_0_5 \
libwx_gtk2u_qa-suse3_0_5 \
libwx_gtk2u_ribbon-suse3_0_5 \
libwx_gtk2u_richtext-suse3_0_5 \
libwx_gtk2u_stc-suse3_0_5 \
libwx_gtk2u_xrc-suse3_0_5 \
pkgconfig(gl) \
pkgconfig(glu)"

inherit rpm
