SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_stc-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "d8b9c807331816f43bda8319b85483fe890e5419fa1e6cf0f95e868f90d132e340787f0d7f967d0ee59dda02c07c487c61450fe9f7b19acdcabbb76b3010cff9"

RPROVIDES:${PN} += "libwx_qtu_stc-suse.so.9.0.0()(64bit) \
libwx_qtu_stc-suse9_0_0 \
libwx_qtu_stc-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_qtu_core-suse.so.9.0.0()(64bit)"

inherit rpm
