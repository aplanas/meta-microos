SUMMARY = "Library files for vnote"
DESCRIPTION = "This package provides library files for vnote."
LICENSE = "LGPL-3.0-only"

PV = "3.10.1"

RPM_NAME = "libVSyntaxHighlighting1-3.10.1-1.9.aarch64.rpm"
RPM_HASH = "8d9401988773425c82462850fe4cefa0b12347f8a5b06598c34b32d1171ce93c48bc2dcbfd2021dadf2c81ab2f0da629c54755a2a014d37d1ae05410f04b892a"

RPROVIDES:${PN} += "libVSyntaxHighlighting.so.1()(64bit) \
libVSyntaxHighlighting1 \
libVSyntaxHighlighting1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
