SUMMARY = "wxWidgets advanced user interface docking library"
DESCRIPTION = "The Advanced User Interface docking library of wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_aui-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "890329110112106d042e014803b68f82d922813aa47b35cfdcbfb2ede4febf4c860c0400f19a5321e25f11ac78392e19841e365d5e8b48ad98fced0e1a296a98"

RPROVIDES:${PN} += "libwx-gtk3u-aui-suse-nostl.so.9.0.0 \
libwx-gtk3u-aui-suse-nostl9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.9.0.0 \
libwx-gtk3u-core-suse-nostl.so.9.0.0"

inherit rpm
