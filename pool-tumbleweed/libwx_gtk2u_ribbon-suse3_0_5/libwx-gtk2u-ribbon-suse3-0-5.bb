SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_ribbon-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "4e3ca0acbf0375e700c23a71f92d02ab01eab84204d9ca0e1b0eac73b160727cffb70886cbd11c3fef15eea6e4c7504e80f9838b679a2cb8cac7f8edb5019dfc"

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
