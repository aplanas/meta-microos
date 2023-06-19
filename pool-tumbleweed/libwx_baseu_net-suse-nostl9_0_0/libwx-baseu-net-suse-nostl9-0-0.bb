SUMMARY = "wxWidgets networking library"
DESCRIPTION = "Classes for network access with wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_baseu_net-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "ab9665e16102c465e6bf2eb90626e59123d589fe3cc5b86cf10a967aa7c17f90a723800579eceb4d94e26501602e4be833f16aa74026dcde6d842c807d597212"

RPROVIDES:${PN} += "libwx-baseu-net-suse-nostl.so.9.0.0 \
libwx-baseu-net-suse-nostl9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.9.0.0"

inherit rpm
