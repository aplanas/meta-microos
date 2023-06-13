SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_xrc-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "54b3f69a22b4b71fd3bfd0b3e1aa6931d756074661c7b2c08034a192c635ebe803e13204c7672b6d0de5927cfb07384a838b850c4b55909a80242e7c3046f73a"

RPROVIDES:${PN} += "libwx_gtk2u_xrc-suse.so.3.0.5()(64bit) \
libwx_gtk2u_xrc-suse3_0_5 \
libwx_gtk2u_xrc-suse3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_baseu_xml-suse.so.3.0.5()(64bit) \
libwx_gtk2u_adv-suse.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse.so.3.0.5()(64bit) \
libwx_gtk2u_html-suse.so.3.0.5()(64bit)"

inherit rpm
