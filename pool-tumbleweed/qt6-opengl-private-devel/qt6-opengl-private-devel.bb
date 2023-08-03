SUMMARY = "Non-ABI stable API for the Qt 6 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt6OpenGL that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-opengl-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7663542464c214385aa5460f35064e00b703cb3863e938844f002d4cb063e0723623e6acf4f9fadcfc9016c1789f1e01cefa99ff00f0e9be8dc39eef2fab52a9"

RPROVIDES:${PN} += "qt6-opengl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6OpenGL \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
