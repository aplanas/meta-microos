SUMMARY = "Documentation for texlive-xfor"
DESCRIPTION = "This package includes the documentation for texlive-xfor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05svn15878"

RPM_NAME = "texlive-xfor-doc-2023.201.1.05svn15878-52.2.noarch.rpm"
RPM_HASH = "5fda14ce7b5751cda2d0e5985e5f8ce5244e9e716adcd53478486e404f0eb8660f0d61543269fdcdfe29e07ed1fa68f621462d57ef2bb9f69c568a558263b50a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xfor-doc"

RDEPENDS:${PN} += ""

inherit rpm
