SUMMARY = "Documentation for texlive-tikz-sfc"
DESCRIPTION = "This package includes the documentation for texlive-tikz-sfc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn49424"

RPM_NAME = "texlive-tikz-sfc-doc-2023.201.1.0.1svn49424-52.1.noarch.rpm"
RPM_HASH = "e5f7b8939a16a82502fcbc8224b3e53f90d2e572cf242e08889825d56bd90f5d688e474556e2e88e70a17abd619465586853d5e5ede2ee329d5a606b9b6d4255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-sfc-doc"

RDEPENDS:${PN} += ""

inherit rpm
