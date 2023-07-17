SUMMARY = "Non-ABI stable API for the Qt 6 SensorsQuick library"
DESCRIPTION = "This package provides private headers of libQt6SensorsQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensorsquick-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "ac653ee03585590c4f272eaeb7985c9bef36edc8770e50e340b009962647ea59cb0abbe8dffa38f0f4a8bfe026ea380a25aaea6e67751b19ada3154c9715c8ab"

RPROVIDES:${PN} += "qt6-sensorsquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6SensorsQuick"

inherit rpm
