SUMMARY = "Qt 6 QuickEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickeffects-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "f83f1dd27525a336d8eda07f6bde38e913721d07ceb70749b7098d6bbab7a0c4474580898e27682c5117aeccb39363d8335615fdadc6d7f8f2076a0b8d22493a"

RPROVIDES:${PN} += "cmake(Qt6QuickEffectsPrivate) \
qt6-quickeffects-private-devel \
qt6-quickeffects-private-devel(aarch-64)"

RDEPENDS:${PN} += "libQt6QuickEffects6 \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
