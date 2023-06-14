SUMMARY = "wxWidgets HTML/browser class library"
DESCRIPTION = "Library for a wxWidgets control that can be used to render web \
(HTML / CSS / JavaScript) documents."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_webview-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "9dcf79134bfbdaa2c38d8d4c41ce14b242f8a1b75339103dc89695decd8c5b6acabaa3fb27754a0e38bf209cf1df3e595e1e9fee39a394c95ebff54d2d6f27c9"

RPROVIDES:${PN} += "libwx-gtk3u-webview-suse.so.9.0.0 \
libwx-gtk3u-webview-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjavascriptcoregtk-4.0.so.18 \
libstdc++.so.6 \
libwebkit2gtk-4.0.so.37 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
