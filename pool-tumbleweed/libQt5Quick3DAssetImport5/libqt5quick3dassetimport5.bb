SUMMARY = "Qt5 Quick3D Asset Importing Library"
DESCRIPTION = "Qt Quick 3D Library for importing of 3D assets."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde1"

RPM_NAME = "libQt5Quick3DAssetImport5-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "39afbb7d93dccefc0b69f80c8b1824f120e260bf719878c02a0e388fad0b6f0de881496f981daef73d11b29cb9aaa78a602171ac88c113c6ffc03f585642349d"

RPROVIDES:${PN} += "libQt5Quick3DAssetImport.so.5()(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.0)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.1)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.10)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.11)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.12)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.13)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.14)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.15)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.2)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.3)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.4)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.5)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.6)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.7)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.8)(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.9)(64bit) \
libQt5Quick3DAssetImport5 \
libQt5Quick3DAssetImport5(aarch-64) \
libassimp.so()(64bit) \
libuip.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Quick3DUtils.so.5()(64bit) \
libQt5Quick3DUtils.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libassimp.so.5()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
