SUMMARY = "Non-ABI stable API for the Qt 6 SerialBus library"
DESCRIPTION = "This package provides private headers of libQt6SerialBus that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fcbe7f25208cc39d33bfd4a259cc319da5d5c4f594f048f8483c2e197b26acafa5856375f92819f722035b8d87314d36092abc3fbc0184d73943a21e976270ff"

RPROVIDES:${PN} += "qt6-serialbus-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
cmake-Qt6SerialBus \
cmake-Qt6SerialPort \
qt6-core-private-devel"

inherit rpm
