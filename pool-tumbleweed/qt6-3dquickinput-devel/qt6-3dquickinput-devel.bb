SUMMARY = "Development files for the Qt 6 3DQuickInput library"
DESCRIPTION = "Development files for the Qt 6 3DQuickInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickinput-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "229a55849788b704ede890d0d79bfd29fa9fb5dd05bb8e58b60c5966aba26dfa751dda69fea8d3e216cf39ca4b28efb20550035173fb6673798932502f730ef6"

RPROVIDES:${PN} += "cmake-Qt63DQuickInput \
pkgconfig-Qt63DQuickInput \
qt6-3dquickinput-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DInput \
cmake-Qt63DQuick \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickInput6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DInput \
pkgconfig-Qt63DQuick \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml"

inherit rpm
