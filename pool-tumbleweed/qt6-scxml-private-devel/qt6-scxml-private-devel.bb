SUMMARY = "Non-ABI stable API for the Qt 6 Scxml library"
DESCRIPTION = "This package provides private headers of libQt6Scxml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "32530e2e1795aaa98a111b5da7a17252a6d4c4e358d0da0ec438251902ce8224eeee726910cda83366b1c614d1fb2d55912e29faeafb167bbdfad63790436089"

RPROVIDES:${PN} += "qt6-scxml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Scxml \
qt6-qml-private-devel"

inherit rpm
