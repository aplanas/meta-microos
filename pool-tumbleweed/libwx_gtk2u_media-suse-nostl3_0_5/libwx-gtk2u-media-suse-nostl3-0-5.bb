SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_media-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "da293c8ebff34b4533c7ccb14d76d1203760fd9e3f1c082d431a8103f0f9059898e80dabb7c2a3c6268e629f3a84b31629ee95c66a2c56049860bfcfaf599934"

RPROVIDES:${PN} += "libwx-gtk2u-media-suse-nostl.so.3.0.5 \
libwx-gtk2u-media-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5"

inherit rpm
