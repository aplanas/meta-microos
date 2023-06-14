SUMMARY = "wxWidgets advanced user interface docking library"
DESCRIPTION = "The Advanced User Interface docking library of wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_aui-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "85e2094b87a1dfd0576b91fae5ebe761844bdc650f1c8ae03728f1cec6ee46745598b20bf2a7bb203797d2e416b37175d13548feb2f1dbc0d7601a33f6f95e8d"

RPROVIDES:${PN} += "libwx-gtk3u-aui-suse.so.9.0.0 \
libwx-gtk3u-aui-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
