SUMMARY = "Qt ExampleIcons module"
DESCRIPTION = "Qt icon library for examples. This private library can be used by Qt examples."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-exampleicons-devel-static-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "090fd342b6e6b548bc994ae5df0f33fd17fc9a99299a6cc896cf2437da8ab6d45d9be4a456b85652a6eca824a4906f357d828ab328080222847629fc66c93042"

RPROVIDES:${PN} += "cmake-Qt6ExampleIconsPrivate \
qt6-exampleicons-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
