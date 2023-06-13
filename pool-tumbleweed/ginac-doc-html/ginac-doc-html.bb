SUMMARY = "API documentation for GiNaC in HTML format"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package provides the API documentation for GiNaC in HTML format."
LICENSE = "GPL-2.0-only"

PV = "1.8.5"

RPM_NAME = "ginac-doc-html-1.8.5-2.3.noarch.rpm"
RPM_HASH = "139988fa80dd203a043b105bd7079f60b383e906a2c94c9f383d162faa2688b3a9c702ccc7a527357890c5a3e3e22242b41d3d272c4d711e6aff048ff237decd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ginac-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
