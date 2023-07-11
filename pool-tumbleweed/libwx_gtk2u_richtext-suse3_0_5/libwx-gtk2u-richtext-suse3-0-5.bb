SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_richtext-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "14f7212761ba050ad454acdb585a842c6b632f824fda603ac87205dbfdd5003d768038bfd48f90e1d09a85960d7db86fdac445c59110ac300f6ee4527e47f919"

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
