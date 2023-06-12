SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_xml-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "d5d739ea637e5ec4c0bbe18dac483636b4724695f1c86df7e6dc0dbe4cf7a334aa7429e0989caa67305a04ac7ec16becb5892faee42262e880fb7b6d340fd162"

RPROVIDES:${PN} += "libwx_baseu_xml-suse.so.3.0.5()(64bit) \
libwx_baseu_xml-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_baseu_xml-suse.so.3.0.5(WXU_3.0.1)(64bit) \
libwx_baseu_xml-suse.so.3.0.5(WXU_3.0.2)(64bit) \
libwx_baseu_xml-suse.so.3.0.5(WXU_3.0.3)(64bit) \
libwx_baseu_xml-suse.so.3.0.5(WXU_3.0.4)(64bit) \
libwx_baseu_xml-suse.so.3.0.5(WXU_3.0.5)(64bit) \
libwx_baseu_xml-suse3_0_5 \
libwx_baseu_xml-suse3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
