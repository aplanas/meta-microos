SUMMARY = "Non-ABI stable API for the Qt 6 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt6DBus that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-dbus-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "f5b4a704d87631a054193e81ac7650381edf6bdb407160b6f423cb0625d11260f4cede0a9980e9de7887b2d30aa5265bbaba97b35e948154ca53b3067c09a7d3"

RPROVIDES:${PN} += "qt6-dbus-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DBus \
qt6-core-private-devel"

inherit rpm
