SUMMARY = "wxWidgets media class library"
DESCRIPTION = "wxMediaCtrl is a class for displaying types of media, such as videos, \
audio files, natively through native codecs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_media-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "abaff37bcb75eaf55108b6cce77de3b43ccf3d0fe69e6f77d70f429c3377a6006e6059e1a79a1df873d383e68a46ac460928cffa579cdfea3ed9f37521c1a8d3"

RPROVIDES:${PN} += "libwx-gtk3u-media-suse.so.9.0.0 \
libwx-gtk3u-media-suse9-0-0"

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
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
