SUMMARY = "Non-ABI stable API for the Qt 6 QmlCore library"
DESCRIPTION = "This package provides private headers of libQt6QmlCore that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlcore-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "54e115b01d22a0def61e01a2e258cfc99d06688f9c96d00857443e1ca0f68303e9846005aae7b8fa3d45b21efff032d60c588b8a577d77f52f49548b64d5c315"

RPROVIDES:${PN} += "qt6-qmlcore-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlCore"

inherit rpm
