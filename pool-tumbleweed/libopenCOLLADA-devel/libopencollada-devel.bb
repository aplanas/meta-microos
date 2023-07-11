SUMMARY = "Include files for openCOLLADA development"
DESCRIPTION = "This package provides the include files necessary to build and \
develop with the openCOLLADA export and import libraries."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libopenCOLLADA-devel-1.6.68-1.13.aarch64.rpm"
RPM_HASH = "55dca496e7580e5546a4931a1dcb145c4139080432ec65d8f71f17e4a98b4f96ee1fa626b28053ddaf791fd27293d47c85454dfeebbada40bc0feacf7c3c0570"

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
