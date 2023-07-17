SUMMARY = "Qt 6 Quick3DGlslParser library"
DESCRIPTION = "The Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DGlslParser6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "bd20074170a80a13995b3f5447a812746297f8f06339865ce1825b088959711727d37b4fc278dfc58e7d7cdd773d41564bc47e7b465ca46c14b5500679b770f6"

RPROVIDES:${PN} += "libQt6Quick3DGlslParser.so.6 \
libQt6Quick3DGlslParser6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
