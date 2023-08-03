SUMMARY = "Non-ABI stable API for the Qt 6 StateMachine library"
DESCRIPTION = "This package provides private headers of libQt6StateMachine that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-statemachine-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6e86c5e07ffeff4d74b2f8767b454f34b47ef287bcad7a067671f306f13684fd8ce5e55e9b669c27be96ce67d78b733c6f718120b8fa614098cb0f9a16711503"

RPROVIDES:${PN} += "qt6-statemachine-private-devel"

RDEPENDS:${PN} += "cmake-Qt6StateMachine \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
