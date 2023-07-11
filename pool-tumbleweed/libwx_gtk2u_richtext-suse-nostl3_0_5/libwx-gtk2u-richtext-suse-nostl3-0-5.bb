SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_richtext-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "0404528b5a0681c19c2b73249f92be32b8caef6703da13433d90da9119dbf679cca8e85e05be5202f2dc5a67aff5c51c373ef241211c1361849c5e69646033e6"

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
