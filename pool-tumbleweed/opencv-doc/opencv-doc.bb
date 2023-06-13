SUMMARY = "Documentation and examples for OpenCV"
DESCRIPTION = "This package contains the documentation and examples for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "opencv-doc-4.7.0-1.6.noarch.rpm"
RPM_HASH = "56d457ea579e63e23457f700dbcd3770c2afd64dfb1543b5cdc0bcaab8c649e9f92be860d74b59a401cb89c9c41e4d334bb356d83d7cc8e002715d23fe38729d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencv-doc \
opencv-qt5-doc"

RDEPENDS:${PN} += ""

inherit rpm
