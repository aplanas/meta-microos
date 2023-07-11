SUMMARY = "Qt ExampleIcons module"
DESCRIPTION = "Qt icon library for examples. This private library can be used by Qt examples."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-exampleicons-devel-static-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "0f0e0e114498f9c9cb134884d09507a0767c6370389fcf3c8078a998258c460782e7685a441c487a06fbae1136b344eaf791ee442c4b3d1174a5e178de194a1f"

RPROVIDES:${PN} += "cmake-Qt6ExampleIconsPrivate \
qt6-exampleicons-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
