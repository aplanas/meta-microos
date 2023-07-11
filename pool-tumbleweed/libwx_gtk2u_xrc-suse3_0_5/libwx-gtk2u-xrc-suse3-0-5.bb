SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_xrc-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "64e2974cd817761612551f5ea7948aad16b427ceb2afe74d827a3b8690a7b69a42ce87508dc4a2fed41ae632b573c17f09f70c1f9c0d458e8cf14842ac09fc52"

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
