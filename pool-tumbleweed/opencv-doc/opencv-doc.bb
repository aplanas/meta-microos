SUMMARY = "Documentation and examples for OpenCV"
DESCRIPTION = "This package contains the documentation and examples for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "opencv-doc-4.7.0-1.8.noarch.rpm"
RPM_HASH = "703b80d2402f582ced5999e2d1aea03b976edd1192518c58172390b3ead81b4ac1ebaee552d34117cbe0d0be54c1bbaf8efa505bc280aa079b1ee55df8345f88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencv-doc \
opencv-qt5-doc"

RDEPENDS:${PN} += ""

inherit rpm
