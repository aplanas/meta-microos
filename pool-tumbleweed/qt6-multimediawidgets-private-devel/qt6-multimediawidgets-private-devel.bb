SUMMARY = "Non-ABI stable API for the Qt 6 MultimediaWidgets Library"
DESCRIPTION = "This package provides private headers of libQt6MultimediaWidgets that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimediawidgets-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e84b96256b4b5420f5dada1d70c3a16f3aa7ba3d829c9e47fc6f424d3a94ee824eb0c1ae943d720e2aa29e5d28bfaffaceb0e265b4753c3979767096746d87a5"

RPROVIDES:${PN} += "qt6-multimediawidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6MultimediaWidgets \
qt6-widgets-private-devel"

inherit rpm
