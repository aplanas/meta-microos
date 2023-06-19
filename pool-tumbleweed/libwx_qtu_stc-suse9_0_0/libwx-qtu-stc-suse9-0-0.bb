SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_stc-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "d8b9c807331816f43bda8319b85483fe890e5419fa1e6cf0f95e868f90d132e340787f0d7f967d0ee59dda02c07c487c61450fe9f7b19acdcabbb76b3010cff9"

RPROVIDES:${PN} += "libwx-qtu-stc-suse.so.9.0.0 \
libwx-qtu-stc-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-qtu-core-suse.so.9.0.0"

inherit rpm
