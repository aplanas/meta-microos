SUMMARY = "Non-ABI stable API for the Qt 6 Widgets library"
DESCRIPTION = "This package provides private headers of libQt6Widgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-widgets-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "54ec3cd5b2fe311f1b047275649b88b0f08033f6d8c99f265644ed59413a49ba06dfdd3c6f14bed391fbdbb4e3a41af25b758a3a112a7c86f1e58cae7a77dfdc"

RPROVIDES:${PN} += "qt6-widgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Widgets \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
