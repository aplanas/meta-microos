SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_richtext-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "ab754ce8ab1476c65735f6bc5cae52b5288207caf8508002158e37e37cfc6215bd4bab3259f45b6df24ef6d5aa890cfeaf71af81eaa99a908145a609d190e47c"

RPROVIDES:${PN} += "libwx_gtk2u_richtext-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_richtext-suse-nostl3_0_5 \
libwx_gtk2u_richtext-suse-nostl3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse-nostl.so.3.0.5()(64bit) \
libwx_baseu_xml-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_adv-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_html-suse-nostl.so.3.0.5()(64bit)"

inherit rpm
