SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_aui-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "4ba8f57190ecfeda9bfa1910d113675fa720a3d992f2e034c15f9f647eb7897020e2c08f52b5572b9a04a7d262c299fe80904bc75ddaa2c650e6cc5c79fa2ce6"

RPROVIDES:${PN} += "libwx-gtk2u-aui-suse-nostl.so.3.0.5 \
libwx-gtk2u-aui-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5"

inherit rpm
