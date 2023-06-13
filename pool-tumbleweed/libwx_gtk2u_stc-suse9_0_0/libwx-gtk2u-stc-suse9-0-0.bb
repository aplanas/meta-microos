SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_stc-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "72d0fd629054b62bf61736c1f25ff72d20418f4b1e0a9447e943d41bcf662486906c17d57e99caa28dfe46a992dea75a504304aedeb9a402d63db8867e01b924"

RPROVIDES:${PN} += "libwx_gtk2u_stc-suse.so.9.0.0()(64bit) \
libwx_gtk2u_stc-suse9_0_0 \
libwx_gtk2u_stc-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit)"

inherit rpm
