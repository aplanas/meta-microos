SUMMARY = "Non-ABI stable API for the Qt 6 StateMachine library"
DESCRIPTION = "This package provides private headers of libQt6StateMachine that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachine-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "29d51213061b90a6bdcdc05f4fd6e525ad34c2669cb12dc2e50a2cf98446240c16e6331149b9f7a131b3716c2a9a254d536304cbfdbe280b0e27351d78eac11c"

RPROVIDES:${PN} += "qt6-statemachine-private-devel"

RDEPENDS:${PN} += "cmake-Qt6StateMachine \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
