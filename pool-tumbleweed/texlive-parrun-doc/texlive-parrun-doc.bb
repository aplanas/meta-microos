SUMMARY = "Documentation for texlive-parrun"
DESCRIPTION = "This package includes the documentation for texlive-parrun"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-parrun-doc-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "6a291e4d4953ad8f590d9ba0e947167f92edaa93fd38bd741e7d24af5fce14f4b232d29d53ec9a9bf243dce3e33aed1b2bc6c21a80ee0e72934f001be96f1b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parrun-doc"

RDEPENDS:${PN} += ""

inherit rpm
