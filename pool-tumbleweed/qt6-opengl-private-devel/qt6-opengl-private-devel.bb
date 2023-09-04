SUMMARY = "Non-ABI stable API for the Qt 6 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt6OpenGL that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-opengl-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "bb2812d039d81ac029452e856d19b1f308233fc72892f1fd7ed338ddabf5db009cd7245cae50e989b08727cfe0d384355a77f36f087a3b77bb92a2bd9fd8413f"

RPROVIDES:${PN} += "qt6-opengl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6OpenGL \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
