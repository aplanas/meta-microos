SUMMARY = "Non-ABI stable API for the Qt 6 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt6OpenGL that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-opengl-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "b0417350873ac6b1bce4d6e977e69629fa636f54c3c72fcac1e2973c8c31af26432b9cf212a4ba2b1520baaefb689cbae4f0c98e6750e9638d93d87cfe12c15b"

RPROVIDES:${PN} += "qt6-opengl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6OpenGL \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
