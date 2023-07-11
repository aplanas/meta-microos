SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_html-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "3fc9a55d9f0e58ad330211d0016ad4946a9f161540fd09336eceb70d429bcfffcb4697954cace3d7d6064110a2996a0ce4e9e47b63f003bba2b111a86aee753e"

RPROVIDES:${PN} += "libwx-gtk2u-html-suse-nostl.so.3.0.5 \
libwx-gtk2u-html-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmspack.so.0 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5"

inherit rpm
