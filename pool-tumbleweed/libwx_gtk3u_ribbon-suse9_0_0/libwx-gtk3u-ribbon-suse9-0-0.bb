SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_ribbon-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "dc9978b7d5a37b81661942e380a6cb6f7285308a2e552fad1b37da78a12712aa973a241fefbdf4647c75d08cb4ebabcd3fe41bc22223ede519e4bfa4023352d0"

RPROVIDES:${PN} += "libwx_gtk3u_ribbon-suse.so.9.0.0()(64bit) \
libwx_gtk3u_ribbon-suse9_0_0 \
libwx_gtk3u_ribbon-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit)"

inherit rpm
