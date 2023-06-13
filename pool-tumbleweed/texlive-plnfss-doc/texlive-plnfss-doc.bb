SUMMARY = "Documentation for texlive-plnfss"
DESCRIPTION = "This package includes the documentation for texlive-plnfss"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-plnfss-doc-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "c58d9627852a9195d97f9ee3d10488fb1ee7ea6e1a188cd7ba3a48a9058ff6c32227aec61d805da3e7d1b6744407df5c64feda956cb05c25022a3d5935f66559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plnfss-doc"

RDEPENDS:${PN} += ""

inherit rpm
