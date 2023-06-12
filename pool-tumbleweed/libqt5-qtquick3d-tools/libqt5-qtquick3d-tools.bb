SUMMARY = "Qt Development Kit"
DESCRIPTION = "Tools for working with the Qt Quick 3D module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtquick3d-tools-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "40d435261c3f56ba3cf136030affb9ee6369a6a41d9ee4435748d783f18fc5e87c50c075bee2f41c82cbf4839cafe5be2cb67d59ed3e97f68a79e45f4180903e"

RPROVIDES:${PN} += "libqt5-qtquick3d-tools \
libqt5-qtquick3d-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Quick3DAssetImport.so.5()(64bit) \
libQt5Quick3DAssetImport.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
