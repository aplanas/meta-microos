SUMMARY = "Non-ABI stable API for the Qt 6 StateMachine library"
DESCRIPTION = "This package provides private headers of libQt6StateMachine that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachine-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a8392399c7742fa478a869b7491c24434e7bcb82d78197ea409882032690711493056851dd01f3fe86c896a3b4e7ac53c712da5bd4c0380affbf53f56350c001"

RPROVIDES:${PN} += "qt6-statemachine-private-devel"

RDEPENDS:${PN} += "cmake-Qt6StateMachine \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
