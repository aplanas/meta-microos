SUMMARY = "Non-ABI stable API for the Qt 6 Widgets library"
DESCRIPTION = "This package provides private headers of libQt6Widgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-widgets-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "f6298204af6c841e8779d3d680d3a10422ae6f47db81d00e8058f3332e71acdf51403ba24ad2a6e46abce4040dc871e3148fcaa791d44446851f1586e3aeae23"

RPROVIDES:${PN} += "qt6-widgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Widgets \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
