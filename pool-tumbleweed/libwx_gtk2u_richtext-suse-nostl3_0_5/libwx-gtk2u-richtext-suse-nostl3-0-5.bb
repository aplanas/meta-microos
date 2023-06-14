SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_richtext-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "ab754ce8ab1476c65735f6bc5cae52b5288207caf8508002158e37e37cfc6215bd4bab3259f45b6df24ef6d5aa890cfeaf71af81eaa99a908145a609d190e47c"

RPROVIDES:${PN} += "libwx-gtk2u-richtext-suse-nostl.so.3.0.5 \
libwx-gtk2u-richtext-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-baseu-xml-suse-nostl.so.3.0.5 \
libwx-gtk2u-adv-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5 \
libwx-gtk2u-html-suse-nostl.so.3.0.5"

inherit rpm
