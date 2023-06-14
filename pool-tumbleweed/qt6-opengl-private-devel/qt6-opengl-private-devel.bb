SUMMARY = "Non-ABI stable API for the Qt 6 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt6OpenGL that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-opengl-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "bf4dd4163009d6f402457765525c5a8f06ccdb81f7a322c2dbcd8e7db95315cd4f97802f929d8378ceac9170bf9d865ffcc5f6bebf620af63143b8d9d9378fb5"

RPROVIDES:${PN} += "qt6-opengl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6OpenGL \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
