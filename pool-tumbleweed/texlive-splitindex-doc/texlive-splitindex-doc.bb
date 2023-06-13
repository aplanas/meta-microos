SUMMARY = "Documentation for texlive-splitindex"
DESCRIPTION = "This package includes the documentation for texlive-splitindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2csvn39766"

RPM_NAME = "texlive-splitindex-doc-2023.201.1.2csvn39766-57.1.noarch.rpm"
RPM_HASH = "36bab18b005108894bf3b53dba5b4ff8d941bdef8fd6a4ae355e9ff2fc8b9453f4f47a7ed0eafd173b235814515c4298d0134411c9d4493d283a4048601c7715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(splitindex.1) \
texlive-splitindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
