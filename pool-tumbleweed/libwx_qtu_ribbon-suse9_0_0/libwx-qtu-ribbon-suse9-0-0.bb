SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_ribbon-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "5d095c4d5926d54550ebac28fc80caba1aca1445b112be954a6a98f29ed7a68c44abf99785bd86932067419d9727c7d84c8b839da6f7cab5c90c4e35fa0d5b8b"

RPROVIDES:${PN} += "libwx-qtu-ribbon-suse.so.9.0.0 \
libwx-qtu-ribbon-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-qtu-core-suse.so.9.0.0"

inherit rpm
