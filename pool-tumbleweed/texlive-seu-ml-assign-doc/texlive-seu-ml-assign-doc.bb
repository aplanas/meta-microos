SUMMARY = "Documentation for texlive-seu-ml-assign"
DESCRIPTION = "This package includes the documentation for texlive-seu-ml-assign"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn62933"

RPM_NAME = "texlive-seu-ml-assign-doc-2023.201.1.1svn62933-53.1.noarch.rpm"
RPM_HASH = "3ea3683cc1e1f406baa937e0b5e7e6420765c4c2118a5e58ad2f4182b1fc3003542597d1bfee347ce67d5a3864fb47454ef84f830f4461b569ec4b07b885b098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seu-ml-assign-doc"

RDEPENDS:${PN} += ""

inherit rpm
