SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_aui-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "d5d9417dbb1ff725a6cfa1cce8620f65e07e024cec7bd4d74cec29bb114b11d8bda63c5901617035d6f959b42523ba75ec9d0c176bed37276bca653ab6cedb74"

RPROVIDES:${PN} += "libwx-gtk2u-aui-suse.so.3.0.5 \
libwx-gtk2u-aui-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
