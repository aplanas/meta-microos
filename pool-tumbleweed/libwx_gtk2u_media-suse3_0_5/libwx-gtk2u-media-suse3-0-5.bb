SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_media-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "80aebe11279e09b4f234e38b0e1ec3fe9985a6b7954189e4ca1280a1d13b7060460c3996e98a5e60292eebd948907f5a29f265a486fef4b4d8b57144c0d2d8e3"

RPROVIDES:${PN} += "libwx-gtk2u-media-suse.so.3.0.5 \
libwx-gtk2u-media-suse3-0-5"

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
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5"

inherit rpm
