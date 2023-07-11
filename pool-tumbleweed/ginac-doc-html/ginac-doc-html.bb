SUMMARY = "API documentation for GiNaC in HTML format"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package provides the API documentation for GiNaC in HTML format."
LICENSE = "GPL-2.0-only"

PV = "1.8.6"

RPM_NAME = "ginac-doc-html-1.8.6-1.1.noarch.rpm"
RPM_HASH = "6eb71137d146d09ad072ccd750ab7cd04e7a389ba37773c2b510b6df81ac1e3d600519c9a67d95c7e6bf82f3c8d0555359dbf8c1ac572497218480e9ba693439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ginac-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
