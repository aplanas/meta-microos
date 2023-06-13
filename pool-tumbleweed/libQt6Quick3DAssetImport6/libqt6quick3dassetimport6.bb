SUMMARY = "Qt 6 Quick3DAssetImport library"
DESCRIPTION = "The Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DAssetImport6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4ac988628a01a274500dac8115ed8cd715de5e48f7f9def6bd55cc9660516db57ea6311733cd2864ff1f6190c11bd736271d4097d2e1d3e5337bb5dac9ba050a"

RPROVIDES:${PN} += "libQt6Quick3DAssetImport.so.6()(64bit) \
libQt6Quick3DAssetImport.so.6(Qt_6)(64bit) \
libQt6Quick3DAssetImport.so.6(Qt_6.0)(64bit) \
libQt6Quick3DAssetImport.so.6(Qt_6.1)(64bit) \
libQt6Quick3DAssetImport.so.6(Qt_6.2)(64bit) \
libQt6Quick3DAssetImport.so.6(Qt_6.3)(64bit) \
libQt6Quick3DAssetImport.so.6(Qt_6.4)(64bit) \
libQt6Quick3DAssetImport.so.6(Qt_6.5)(64bit) \
libQt6Quick3DAssetImport.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick3DAssetImport6 \
libQt6Quick3DAssetImport6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
