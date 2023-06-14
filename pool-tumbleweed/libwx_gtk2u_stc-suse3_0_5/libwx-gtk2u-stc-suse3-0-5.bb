SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_stc-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "c848dedab605fbb5d6778aa2d2529f6bd344bbaaaad209804c7c12f23c2502e45e19880364e33ec0a9b3b1085c8f77b26dc26a97b965eb58ae165da314bcd66a"

RPROVIDES:${PN} += "libwx-gtk2u-stc-suse.so.3.0.5 \
libwx-gtk2u-stc-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
