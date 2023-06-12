SUMMARY = "wxWidgets quality assurance class library"
DESCRIPTION = "This is the library containing extra classes for quality \
assurance, containing the wxDebugReport class. wxDebugReport is \
used to generate a debug report, containing information about the \
program current state."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_qa-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "49db112a176a583d3e4fa85d1c6a6c054220b4b527d604f7acc5f3392d371e8b3abfb48d7aef29de787f64d4b1c81d054d5e067d0d463ebc42f48a9f59fe5e9e"

RPROVIDES:${PN} += "libwx_gtk3u_qa-suse.so.9.0.0()(64bit) \
libwx_gtk3u_qa-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_qa-suse.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_gtk3u_qa-suse.so.9.0.0(WXU_3.2.2)(64bit) \
libwx_gtk3u_qa-suse9_0_0 \
libwx_gtk3u_qa-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm