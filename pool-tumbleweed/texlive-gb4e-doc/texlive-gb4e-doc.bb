SUMMARY = "Documentation for texlive-gb4e"
DESCRIPTION = "This package includes the documentation for texlive-gb4e"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19216"

RPM_NAME = "texlive-gb4e-doc-2023.201.svn19216-52.1.noarch.rpm"
RPM_HASH = "4658fb6106657dea529d41d473a42c3ac0f500553f1f91e3cfce0ac9566993bc882454be27e1ab7ddaea5b8cb54d44381c40e0cacdde0cff63dc1319387fda45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gb4e-doc"

RDEPENDS:${PN} += ""

inherit rpm
