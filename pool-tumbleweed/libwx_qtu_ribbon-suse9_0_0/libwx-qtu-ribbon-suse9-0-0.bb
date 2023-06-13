SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_ribbon-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "5d095c4d5926d54550ebac28fc80caba1aca1445b112be954a6a98f29ed7a68c44abf99785bd86932067419d9727c7d84c8b839da6f7cab5c90c4e35fa0d5b8b"

RPROVIDES:${PN} += "libwx_qtu_ribbon-suse.so.9.0.0()(64bit) \
libwx_qtu_ribbon-suse9_0_0 \
libwx_qtu_ribbon-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_qtu_core-suse.so.9.0.0()(64bit)"

inherit rpm
