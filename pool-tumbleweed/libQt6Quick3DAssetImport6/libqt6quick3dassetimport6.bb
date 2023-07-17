SUMMARY = "Qt 6 Quick3DAssetImport library"
DESCRIPTION = "The Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DAssetImport6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0e63813c7eab71f86403c9f03982afb3bab44b17e5b57fe03cbed6419f0fcebca14455ce68f94d644d78b23b4446276d39d270cd566d3f23509f6cfabc5da3bb"

RPROVIDES:${PN} += "libQt6Quick3DAssetImport.so.6 \
libQt6Quick3DAssetImport6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
