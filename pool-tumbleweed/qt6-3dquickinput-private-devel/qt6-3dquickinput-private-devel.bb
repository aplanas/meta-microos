SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickInput library"
DESCRIPTION = "This package provides private headers of libQt63DQuickInput that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickinput-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "2acf50539238e707d62c71993f149fdca85803dc31d0d5130e5124a780ac8f81b1d41ca2d4ff8d8a921d67a5bf71279597d53b8a92d08c9fe11b31f9b738d5be"

RPROVIDES:${PN} += "qt6-3dquickinput-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickInput \
qt6-3dcore-private-devel \
qt6-3dinput-private-devel \
qt6-3dquick-private-devel \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
