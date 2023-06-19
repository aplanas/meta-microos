SUMMARY = "wxWidgets media class library"
DESCRIPTION = "wxMediaCtrl is a class for displaying types of media, such as videos, \
audio files, natively through native codecs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_media-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "47b819fc27a3a6403d7aafd1d791c697ce9cc497c23c0090ba0721808731cdff56e156542b5c72d7dc37825a0abcc8301269982c1c1640e2ec92da4aa1f14ad1"

RPROVIDES:${PN} += "libwx-gtk3u-media-suse-nostl.so.9.0.0 \
libwx-gtk3u-media-suse-nostl9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.9.0.0 \
libwx-gtk3u-core-suse-nostl.so.9.0.0"

inherit rpm
