SUMMARY = "wxWidgets media class library"
DESCRIPTION = "wxMediaCtrl is a class for displaying types of media, such as videos, \
audio files, natively through native codecs."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_media-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "2b69b8f3ef81b400b03a116626e7124a713a8424f1e24ed2795aa1b86adea59957907d93798013d79b7418cc8c4461d5da8faf4777f1da27a582dffe533db3fa"

RPROVIDES:${PN} += "libwx-gtk2u-media-suse.so.9.0.0 \
libwx-gtk2u-media-suse9-0-0"

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
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
