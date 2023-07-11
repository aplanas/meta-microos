SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_html-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "40bec6ec58469fab79b13fed9ac03de0dd47bc77e8d97e178e87582e29f849275c6a2714cd26de00cf693222b2da9e8be2b9fc400b5fae9c6d564d15dcb88693"

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
