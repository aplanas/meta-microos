SUMMARY = "Include files for openCOLLADA development"
DESCRIPTION = "This package provides the include files necessary to build and \
develop with the openCOLLADA export and import libraries."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libopenCOLLADA-devel-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "00e52ca754c98e69a84a1f34849a4f5f4767102df08379dffc7d1a8d375a1ccbcddab968eed6746e1cf18db63709162f6c4c5ae7b358d62dc2d7058a5e6d8486"

RPROVIDES:${PN} += "libopenCOLLADA-devel \
openCOLLADA-devel"

RDEPENDS:${PN} += "libGeneratedSaxParser0-3 \
libMathMLSolver0-3 \
libOpenCOLLADABaseUtils0-3 \
libOpenCOLLADAFramework0-3 \
libOpenCOLLADASaxFrameworkLoader0-3 \
libOpenCOLLADAStreamWriter0-3 \
libUTF0-3 \
libbuffer0-3 \
libftoa0-3"

inherit rpm
