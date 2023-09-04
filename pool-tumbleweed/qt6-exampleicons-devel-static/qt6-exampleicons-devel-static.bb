SUMMARY = "Qt ExampleIcons module"
DESCRIPTION = "Qt icon library for examples. This private library can be used by Qt examples."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-exampleicons-devel-static-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "20a99977d2dc30519e8b719f9b4a33d5ebbd8c18a86f5277cb6021141c047c62bb3e8e614bf5b95023b1823cf34f881661dc94cb9fdff38fdecbfbd23bddddec"

RPROVIDES:${PN} += "cmake-Qt6ExampleIconsPrivate \
qt6-exampleicons-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
