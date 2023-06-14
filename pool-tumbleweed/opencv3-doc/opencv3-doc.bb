SUMMARY = "Documentation and examples for OpenCV"
DESCRIPTION = "This package contains the documentation and examples for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "3.4.19"

RPM_NAME = "opencv3-doc-3.4.19-1.1.aarch64.rpm"
RPM_HASH = "25701fb49d718bd82e57f60e1606bc58f1d69681d6365c9cb46886d14c353daf98e13545a52138e9b6634d79079c69596d6fe60d4d2837c78020569a37a7e66b"

RPROVIDES:${PN} += "opencv-qt5-doc \
opencv3-doc"

RDEPENDS:${PN} += ""

inherit rpm
