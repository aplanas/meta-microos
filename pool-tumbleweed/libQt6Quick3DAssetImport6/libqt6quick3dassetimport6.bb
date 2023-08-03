SUMMARY = "Qt 6 Quick3DAssetImport library"
DESCRIPTION = "The Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DAssetImport6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ff1b2547edd469ccc00777e807e2948ab8e0085858a304f1d892e23715206d5100843bcd3e477c33165a5d7d5e854f4815159d05a630a2eb8c1cbb8e1baef0d3"

RPROVIDES:${PN} += "libQt6Quick3DAssetImport.so.6 \
libQt6Quick3DAssetImport6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
