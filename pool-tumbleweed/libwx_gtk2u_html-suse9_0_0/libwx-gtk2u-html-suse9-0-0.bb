SUMMARY = "wxWidgets HTML parser and renderer library"
DESCRIPTION = "The wxHTML library provides classes for parsing and displaying HTML. \
It is not intended to be a high-end HTML browser. wxHTML can be used \
as a generic rich text viewer – for example, to display an About Box \
or the result of a database search."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_html-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "1778a670feeabc6eaa15c06b210d19e848e6a4aeb565b5c1248e5a75c9b4a7540bd56c9ab52f5374e100125dede6f7808b595dab9be5103acbe276ba072f401f"

RPROVIDES:${PN} += "libwx_gtk2u_html-suse.so.9.0.0()(64bit) \
libwx_gtk2u_html-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_html-suse.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_gtk2u_html-suse.so.9.0.0(WXU_3.2.2)(64bit) \
libwx_gtk2u_html-suse9_0_0 \
libwx_gtk2u_html-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmspack.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
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
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
