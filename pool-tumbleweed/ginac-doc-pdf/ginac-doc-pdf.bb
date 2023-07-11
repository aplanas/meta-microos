SUMMARY = "API documentation for GiNaC in PDF format"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package provides the API documentation for GiNaC in PDF format."
LICENSE = "GPL-2.0-only"

PV = "1.8.6"

RPM_NAME = "ginac-doc-pdf-1.8.6-1.1.noarch.rpm"
RPM_HASH = "caa8d6b645e6a50cd72efa80c2aabe2bd11fc8b185e594bca1c86acac67e03137b4c9cc08bcaaf5f8da6cc385f380db75e28e871b5ec1dc27322bbdc5c53b6ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ginac-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
