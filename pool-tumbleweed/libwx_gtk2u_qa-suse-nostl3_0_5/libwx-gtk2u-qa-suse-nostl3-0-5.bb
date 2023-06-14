SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_qa-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "02a8938e99cbccc9d7a13535d8eb92068d3d896b4bd79a7d6843fae7ba3f167c389457acfd6149347f896f2371b4004a7bbce54cf76e9d09c4d0a94f521eb330"

RPROVIDES:${PN} += "libwx-gtk2u-qa-suse-nostl.so.3.0.5 \
libwx-gtk2u-qa-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-baseu-xml-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5"

inherit rpm
