SUMMARY = "Include files for openCOLLADA development"
DESCRIPTION = "This package provides the include files necessary to build and \
develop with the openCOLLADA export and import libraries."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libopenCOLLADA-devel-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "00e52ca754c98e69a84a1f34849a4f5f4767102df08379dffc7d1a8d375a1ccbcddab968eed6746e1cf18db63709162f6c4c5ae7b358d62dc2d7058a5e6d8486"

RPROVIDES:${PN} += "libopenCOLLADA-devel \
libopenCOLLADA-devel(aarch-64) \
openCOLLADA-devel"

RDEPENDS:${PN} += "libGeneratedSaxParser0_3 \
libMathMLSolver0_3 \
libOpenCOLLADABaseUtils0_3 \
libOpenCOLLADAFramework0_3 \
libOpenCOLLADASaxFrameworkLoader0_3 \
libOpenCOLLADAStreamWriter0_3 \
libUTF0_3 \
libbuffer0_3 \
libftoa0_3"

inherit rpm
