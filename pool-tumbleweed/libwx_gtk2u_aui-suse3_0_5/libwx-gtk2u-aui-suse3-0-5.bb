SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_aui-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "d5d9417dbb1ff725a6cfa1cce8620f65e07e024cec7bd4d74cec29bb114b11d8bda63c5901617035d6f959b42523ba75ec9d0c176bed37276bca653ab6cedb74"

RPROVIDES:${PN} += "libwx_gtk2u_aui-suse.so.3.0.5()(64bit) \
libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0.1)(64bit) \
libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0.2)(64bit) \
libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0.3)(64bit) \
libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0.4)(64bit) \
libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0.5)(64bit) \
libwx_gtk2u_aui-suse3_0_5 \
libwx_gtk2u_aui-suse3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_core-suse.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
