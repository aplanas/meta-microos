SUMMARY = "API documentation for GiNaC in PDF format"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package provides the API documentation for GiNaC in PDF format."
LICENSE = "GPL-2.0-only"

PV = "1.8.5"

RPM_NAME = "ginac-doc-pdf-1.8.5-2.3.noarch.rpm"
RPM_HASH = "7e37e1ea42925a2ab9127689d9bfd45064895bc413766caefced439f66cfb1d7f2dd21d40ef795af8356429b5d5b5999ebac2ff8d22741691a114c3dd2b92628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ginac-doc-pdf"
RDEPENDS:${PN} += ""

inherit rpm
