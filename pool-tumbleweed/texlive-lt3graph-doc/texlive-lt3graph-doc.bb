SUMMARY = "Documentation for texlive-lt3graph"
DESCRIPTION = "This package includes the documentation for texlive-lt3graph"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.9svn45913"

RPM_NAME = "texlive-lt3graph-doc-2023.201.0.0.1.9svn45913-52.1.noarch.rpm"
RPM_HASH = "a3c26a9a113c6ebf0cc9252667eb1045c9a812ecb880b93a4e58622093ab42df4beefb1c5e65967241c4b0b6ac0178637eeda7e6d31a37a6321fe7cf92a84b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lt3graph-doc"
RDEPENDS:${PN} += ""

inherit rpm
