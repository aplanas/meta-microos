SUMMARY = "Non-ABI stable API for the Qt 6 ScxmlQml library"
DESCRIPTION = "This package provides private headers of libQt6ScxmlQml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-scxmlqml-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3f740c13cc30272015127d686c5ef76d4cb609cf81e0fdcbb0a8b69f191be2eea10f4f5ddbe7db43279268a3ee59adc18dbdb6bbe6a83b5118e363ad2a921fe9"

RPROVIDES:${PN} += "qt6-scxmlqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6ScxmlQml"

inherit rpm
