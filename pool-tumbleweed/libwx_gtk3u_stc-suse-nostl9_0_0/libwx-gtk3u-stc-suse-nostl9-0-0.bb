SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_stc-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "ab1aab6a72fbfe3ff7686964bed8ba9d141e3e5a54d2d0e9a4bb8e88244643d83aa6ea69af132c3b7855963066cf9ea950a90d79eba8ea7b6f3347d630ea546e"

RPROVIDES:${PN} += "libwx-gtk3u-stc-suse-nostl.so.9.0.0 \
libwx-gtk3u-stc-suse-nostl9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.9.0.0 \
libwx-gtk3u-core-suse-nostl.so.9.0.0"

inherit rpm
