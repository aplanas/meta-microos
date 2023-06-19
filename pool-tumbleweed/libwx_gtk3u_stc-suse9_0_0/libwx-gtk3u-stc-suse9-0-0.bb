SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_stc-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "16593989adb552cc57de588ccccb657bd5a763fc7242507ec44209b123012e3e5fd2ac28200d8fdab1383fd02a47e6cc8297f6f117ef9eef31f1adadb94a1af2"

RPROVIDES:${PN} += "libwx-gtk3u-stc-suse.so.9.0.0 \
libwx-gtk3u-stc-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
