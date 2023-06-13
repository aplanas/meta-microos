SUMMARY = "wxWidgets advanced user interface docking library"
DESCRIPTION = "The Advanced User Interface docking library of wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_aui-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "85e2094b87a1dfd0576b91fae5ebe761844bdc650f1c8ae03728f1cec6ee46745598b20bf2a7bb203797d2e416b37175d13548feb2f1dbc0d7601a33f6f95e8d"

RPROVIDES:${PN} += "libwx_gtk3u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk3u_aui-suse9_0_0 \
libwx_gtk3u_aui-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit)"

inherit rpm
