SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_qa-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "17cf90940f15768fe9fb436f9a8d90cdb85ee089a41ecd2a27cb690e7c4551e08d69778ef1511f01805bab11090488390e0a5324f23f3d6af30336b3b236a35b"

RPROVIDES:${PN} += "libwx-gtk2u-qa-suse.so.3.0.5 \
libwx-gtk2u-qa-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-baseu-xml-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
