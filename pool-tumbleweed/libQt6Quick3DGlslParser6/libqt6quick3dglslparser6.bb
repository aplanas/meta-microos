SUMMARY = "Qt 6 Quick3DGlslParser library"
DESCRIPTION = "The Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DGlslParser6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "c942d64cc0825c242328cc1834bde7f292ecb7183596640a20bc1b9cbc74b56b8636854d6a14baf0f834b293645fcdadf69d11287d2e917eeebf1d7081a6abbc"

RPROVIDES:${PN} += "libQt6Quick3DGlslParser.so.6 \
libQt6Quick3DGlslParser6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
