SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_xrc-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "60a7d18d48601e1e9b074962ee6c35d354252d3b252de0a675620363f665f874d41c4c1edc4347289923b4966e1a98548db5a5d47946031da83347d487f4aecd"

RPROVIDES:${PN} += "libwx-gtk2u-xrc-suse-nostl.so.3.0.5 \
libwx-gtk2u-xrc-suse-nostl3-0-5"

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
