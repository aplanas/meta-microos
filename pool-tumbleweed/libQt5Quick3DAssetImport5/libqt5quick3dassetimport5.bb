SUMMARY = "Qt5 Quick3D Asset Importing Library"
DESCRIPTION = "Qt Quick 3D Library for importing of 3D assets."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde1"

RPM_NAME = "libQt5Quick3DAssetImport5-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "39afbb7d93dccefc0b69f80c8b1824f120e260bf719878c02a0e388fad0b6f0de881496f981daef73d11b29cb9aaa78a602171ac88c113c6ffc03f585642349d"

RPROVIDES:${PN} += "libQt5Quick3DAssetImport.so.5 \
libQt5Quick3DAssetImport5 \
libassimp.so \
libuip.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Quick3DUtils.so.5 \
libassimp.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
