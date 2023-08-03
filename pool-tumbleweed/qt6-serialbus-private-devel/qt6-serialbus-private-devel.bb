SUMMARY = "Non-ABI stable API for the Qt 6 SerialBus library"
DESCRIPTION = "This package provides private headers of libQt6SerialBus that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-serialbus-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2a30f3fc7a1f6ae66835b346d4e8122619bc0dcd449f64c772c7c01387ff1e80c556a8a42cb3820de339a32c645cd57a6ad8650ad49c20930875e4dc605d438d"

RPROVIDES:${PN} += "qt6-serialbus-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
cmake-Qt6SerialBus \
cmake-Qt6SerialPort \
qt6-core-private-devel"

inherit rpm
