SUMMARY = "wxWidgets advanced user interface docking library"
DESCRIPTION = "The Advanced User Interface docking library of wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_aui-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "6535990558b370480c7677712525ef872b9b043fb54a4a6ba68e789736b8592e80125be4b6c82cfe757385243aeab13b61183a406be8b91bff2a9c43503ba77b"

RPROVIDES:${PN} += "libwx-gtk2u-aui-suse.so.9.0.0 \
libwx-gtk2u-aui-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
