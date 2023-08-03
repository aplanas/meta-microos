SUMMARY = "Non-ABI stable API for the Qt 6 Multimedia Library"
DESCRIPTION = "This package provides private headers of libQt6Multimedia that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-multimedia-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "899fc6dc500783d3ca976f7d7073305a524047cf3762a2d8ef310dc43598bcc7f993cb5269283a4de09d928e2fa0def1caf35037dab386a25ad8818c76c16cc3"

RPROVIDES:${PN} += "qt6-multimedia-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Multimedia \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
