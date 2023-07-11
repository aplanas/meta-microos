SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_ribbon-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "c046894c5865ecaa81c3026b04f4796023e6d9610aa4da08b95fa9ca1561a3ace8b1272a44cf4c5f6157899a747a992e7f6ee0f0647e474076f3876fa31a8fc1"

RPROVIDES:${PN} += "libwx-gtk2u-ribbon-suse.so.3.0.5 \
libwx-gtk2u-ribbon-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
