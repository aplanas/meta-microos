SUMMARY = "Non-ABI stable API for the Qt 6 StateMachine library"
DESCRIPTION = "This package provides private headers of libQt6StateMachine that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachine-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "9ec92d04c54dbb1cc850fff09b1c1804e9bd1c9efe83c7b3f91bc4947ddec24ccbc2ecfe2427ffbb22376a147515af954211534b0acaa7903d377ad785916ef9"

RPROVIDES:${PN} += "qt6-statemachine-private-devel"

RDEPENDS:${PN} += "cmake-Qt6StateMachine \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
