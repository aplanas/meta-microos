SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_xrc-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "54b3f69a22b4b71fd3bfd0b3e1aa6931d756074661c7b2c08034a192c635ebe803e13204c7672b6d0de5927cfb07384a838b850c4b55909a80242e7c3046f73a"

RPROVIDES:${PN} += "libwx-gtk2u-xrc-suse.so.3.0.5 \
libwx-gtk2u-xrc-suse3-0-5"

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
