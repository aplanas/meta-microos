SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_richtext-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "f26da09e21b504faa88494a2f6ef6a17331d9e0762796167baecc2ebbd6a8a2a5736375f9c7e6f76969b2caf00d753ab4a98a428118eafecd6fe10a45e22b533"

RPROVIDES:${PN} += "libwx-gtk2u-richtext-suse.so.3.0.5 \
libwx-gtk2u-richtext-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-baseu-xml-suse.so.3.0.5 \
libwx-gtk2u-adv-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5 \
libwx-gtk2u-html-suse.so.3.0.5"

inherit rpm
