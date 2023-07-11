SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_aui-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "df14b16545f7704beee9f6b3b55755a6e242bb10282546d2deab862861f079233d0fedc854189ca42683fe82f44897fc798716d4312ac266b5a13975103bb694"

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
