SUMMARY = "Documentation for texlive-realhats"
DESCRIPTION = "This package includes the documentation for texlive-realhats"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0svn63595"

RPM_NAME = "texlive-realhats-doc-2023.201.6.0svn63595-53.1.noarch.rpm"
RPM_HASH = "e7a345423417568f5ccf453993e817d108fbdde25eaa0fc08601ffbbbe317b2a75e2c58adadb60b4c747af2585ebfdeaaac2c2f74603b07d7f8ed97ae407b544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realhats-doc"
RDEPENDS:${PN} += ""

inherit rpm
