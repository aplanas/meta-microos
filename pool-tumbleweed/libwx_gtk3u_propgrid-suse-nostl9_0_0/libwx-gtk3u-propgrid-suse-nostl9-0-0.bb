SUMMARY = "wxWidgets property grid class library"
DESCRIPTION = "wxPropertyGrid is a specialized grid for editing properties, in other \
words, name=value pairs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_propgrid-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "7e8b1895ebe20530903e5447191cd4bbe840cf8f2251d162ced1e363716e4b2181fe570077fd84d565b7c634463b9b8de0665e0a3e14a2842dfdb08ec0694d70"

RPROVIDES:${PN} += "libwx-gtk3u-propgrid-suse-nostl.so.9.0.0 \
libwx-gtk3u-propgrid-suse-nostl9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.9.0.0 \
libwx-gtk3u-core-suse-nostl.so.9.0.0"

inherit rpm
