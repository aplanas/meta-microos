SUMMARY = "wxWidgets advanced user interface docking library"
DESCRIPTION = "The Advanced User Interface docking library of wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_aui-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "f2dbe068533a2a6d98a6028145846e95843af8492cb7c886cfb475f6969a5e0059c0efe773f07c03f21a08df4b2b505527f47717418d8bc2653df28e9a7c5b67"

RPROVIDES:${PN} += "libwx-qtu-aui-suse.so.9.0.0 \
libwx-qtu-aui-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-qtu-core-suse.so.9.0.0"

inherit rpm
