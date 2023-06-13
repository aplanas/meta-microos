SUMMARY = "A multi-pane detailed-list file manager"
DESCRIPTION = "4Pane is a multi-pane detailed-list file manager. \
It favors speed over visual effects. \
In addition to standard file manager features, it offers multiple undo and redo \
of most operations (including deletions), archive management including 'virtual \
browsing' inside archives, multiple renaming/duplication of files, a terminal \
emulator and user-defined tools."
LICENSE = "GPL-3.0-only"

PV = "8.0"

RPM_NAME = "4pane-8.0-1.4.aarch64.rpm"
RPM_HASH = "06b5c1180f11e007e09bfd5418f5b07c4da9176c442ff382e389c079c0c45dadd78b6be52573f8e62380a4242bf0da6d3e8df3a62b76426e7684882a6dadea17"

RPROVIDES:${PN} += "4pane \
4pane(aarch-64) \
application() \
application(4Pane.desktop) \
metainfo() \
metainfo(4Pane.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_html-suse.so.9.0.0()(64bit) \
libwx_gtk2u_html-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_xrc-suse.so.9.0.0()(64bit) \
libwx_gtk2u_xrc-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
