SUMMARY = "Documentation and examples for OpenCV"
DESCRIPTION = "This package contains the documentation and examples for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "3.4.19"

RPM_NAME = "opencv3-doc-3.4.19-1.3.aarch64.rpm"
RPM_HASH = "91161919f2153f5e0c19e55848f20dc184a94c9faaa7881a2a37473f1ab1b471df09c44bbed2cf8cc7c6e2be873f72c178a50db6fb534d55d3590f6c49dbb2d0"

RPROVIDES:${PN} += "opencv-qt5-doc \
opencv3-doc"

RDEPENDS:${PN} += ""

inherit rpm
