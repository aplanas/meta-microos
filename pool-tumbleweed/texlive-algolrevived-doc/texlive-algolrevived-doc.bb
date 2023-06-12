SUMMARY = "Documentation for texlive-algolrevived"
DESCRIPTION = "This package includes the documentation for texlive-algolrevived"
LICENSE = "OFL-1.1"

PV = "2023.201.1.052svn56864"

RPM_NAME = "texlive-algolrevived-doc-2023.201.1.052svn56864-54.1.noarch.rpm"
RPM_HASH = "682498c930675c98b644e7c3410e80a86dbd4bfa7eb64dfd44a0ef845a8c23b1b55aa6dfee81560222c2e82016d20f6ffc2dd2cf9b51c2f445267200d283281a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algolrevived-doc"
RDEPENDS:${PN} += ""

inherit rpm
