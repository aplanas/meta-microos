SUMMARY = "Qt ExampleIcons module"
DESCRIPTION = "Qt icon library for examples. This private library can be used by Qt examples."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-exampleicons-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4c4c141b73f180667f742c864ab21e84491e07595c9e0dc4787de920e002f525af7b833a2827e5f9e36b995a9ca4479b1c4e07cd5147448b95f991bc62d91ef5"

RPROVIDES:${PN} += "cmake-Qt6ExampleIconsPrivate \
qt6-exampleicons-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
