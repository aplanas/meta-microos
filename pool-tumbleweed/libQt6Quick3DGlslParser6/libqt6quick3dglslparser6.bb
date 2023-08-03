SUMMARY = "Qt 6 Quick3DGlslParser library"
DESCRIPTION = "The Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DGlslParser6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "cdcb86c5af390871e90885b5f78ff1e7b08bfbd6fec45e0aa7bb8f23b38dca2be47c1389220ea5715425ab5f12a086689b3671154fbc53698d2f69e86c0809a6"

RPROVIDES:${PN} += "libQt6Quick3DGlslParser.so.6 \
libQt6Quick3DGlslParser6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
