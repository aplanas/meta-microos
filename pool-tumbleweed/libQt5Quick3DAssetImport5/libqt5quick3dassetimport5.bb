SUMMARY = "Qt5 Quick3D Asset Importing Library"
DESCRIPTION = "Qt Quick 3D Library for importing of 3D assets."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde1"

RPM_NAME = "libQt5Quick3DAssetImport5-5.15.10+kde1-1.1.aarch64.rpm"
RPM_HASH = "48e333aa9f6d4bde0722c8067fb2f9d9714a0d0920e1c2ad8f681fe013abc2657f175aba57cbc985b7ea9f879cf3fadf879ccb5b92f58c6e91cdbcc1772ba80b"

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
