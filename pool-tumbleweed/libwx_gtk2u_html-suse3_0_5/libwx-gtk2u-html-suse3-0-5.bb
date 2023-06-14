SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_html-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "0ee686a2cc3134a02c602c53b898a7aca08d77ec7734a1bba27fc624d2f5a953211a734ccf3aef788d8a1afcab8723dd0766d65beff0e5e83b5a77fa97f21c8f"

RPROVIDES:${PN} += "libwx-gtk2u-html-suse.so.3.0.5 \
libwx-gtk2u-html-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmspack.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
