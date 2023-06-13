SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_stc-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "16593989adb552cc57de588ccccb657bd5a763fc7242507ec44209b123012e3e5fd2ac28200d8fdab1383fd02a47e6cc8297f6f117ef9eef31f1adadb94a1af2"

RPROVIDES:${PN} += "libwx_gtk3u_stc-suse.so.9.0.0()(64bit) \
libwx_gtk3u_stc-suse9_0_0 \
libwx_gtk3u_stc-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit)"

inherit rpm
