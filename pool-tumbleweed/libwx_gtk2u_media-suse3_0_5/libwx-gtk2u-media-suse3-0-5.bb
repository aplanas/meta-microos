SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_media-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "c477578a05d8f5be30741a3d985278b9d0a75d8037a1ef75baa093ec92570fa601e33c5031e369ad3c2006865275bc253e60e4eafe55ed87561f6c400404d617"

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
