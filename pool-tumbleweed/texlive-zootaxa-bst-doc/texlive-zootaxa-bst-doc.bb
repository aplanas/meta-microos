SUMMARY = "Documentation for texlive-zootaxa-bst"
DESCRIPTION = "This package includes the documentation for texlive-zootaxa-bst"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn50619"

RPM_NAME = "texlive-zootaxa-bst-doc-2023.201.1.0svn50619-52.2.noarch.rpm"
RPM_HASH = "4ad0e56e8509d43281404cbd75a54bed3e25ee1f19e10c61e0414cb853db9c424830596ee1ba35be4f77c3a368bbba38aa755b2d5989f3a26ef758efd4a4c47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zootaxa-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
