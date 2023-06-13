SUMMARY = "Qt6 Quick3DAssetImport library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DAssetImport library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetimport-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "46d0ba29a116185d1adc8c205f394c2ad5306bb2fb7dc2b993fd71ad9cdb3ea87741d4c68507722ca8942e08db44c6fee0416219720300a8db24a52421e4f3c1"

RPROVIDES:${PN} += "cmake(Qt6Quick3DAssetImport) \
pkgconfig(Qt6Quick3DAssetImport) \
qt6-quick3dassetimport-devel \
qt6-quick3dassetimport-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Qml) \
cmake(Qt6Quick3DUtils) \
libQt6Quick3DAssetImport6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Quick3DUtils)"

inherit rpm
