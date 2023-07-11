SUMMARY = "Qt 6 Quick3DAssetImport library"
DESCRIPTION = "The Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DAssetImport6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "9c8b38c0a99b72874b2cf8c5e9d842c1ac82918f47385cd963828b7fd7a534e745b95c2de8a746b4362980fe952c8b984dd3c84616393d9306cc3ff0599e12e6"

RPROVIDES:${PN} += "libQt6Quick3DAssetImport.so.6 \
libQt6Quick3DAssetImport6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
