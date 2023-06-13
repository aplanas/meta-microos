SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_html-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "0ee686a2cc3134a02c602c53b898a7aca08d77ec7734a1bba27fc624d2f5a953211a734ccf3aef788d8a1afcab8723dd0766d65beff0e5e83b5a77fa97f21c8f"

RPROVIDES:${PN} += "libwx_gtk2u_html-suse.so.3.0.5()(64bit) \
libwx_gtk2u_html-suse3_0_5 \
libwx_gtk2u_html-suse3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmspack.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse.so.3.0.5()(64bit)"

inherit rpm
