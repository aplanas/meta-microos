SUMMARY = "Development files for the Qt 6 Bodymovin library"
DESCRIPTION = "This package provides private headers of libQt6Bodymovin that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-bodymovin-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "61863cb6ba6ed42851ea7b3241243c8c50ca352ef251b8749976bfab8adfb0aaa40ca29695d88748018e8ec5f638c3625652a1991b1d21470569f4ee5b4af5bc"

RPROVIDES:${PN} += "cmake-Qt6BodymovinPrivate \
qt6-bodymovin-devel \
qt6-bodymovin-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
qt6-gui-private-devel"

inherit rpm
