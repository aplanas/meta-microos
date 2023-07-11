SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_qa-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "8d784a63fd0d3b2fb0c2b136a1ea5fe896f3f79c982f830680de3b4f0b4eb6c9e26ecddf16cec444b5ffbb7f7b9189372699f7de4cc9601f08083b6ba206c2f3"

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
