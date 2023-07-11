SUMMARY = "Non-ABI stable API for the Qt 6 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt6OpenGL that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-opengl-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "e9019768c1a5a033a1325b58efd6b06ca78a6d600a0cedf60b6549c7df8961e4b4a9b5694717b7f750bd9ad707bc21593ee885bb75234f73e155d0d187f63a40"

RPROVIDES:${PN} += "qt6-opengl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6OpenGL \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
