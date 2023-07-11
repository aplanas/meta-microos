SUMMARY = "Documentation for texlive-xsavebox"
DESCRIPTION = "This package includes the documentation for texlive-xsavebox"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.18svn64049"

RPM_NAME = "texlive-xsavebox-doc-2023.201.0.0.18svn64049-52.2.noarch.rpm"
RPM_HASH = "d7e048b9d125516df7dc4ca6e2d34f3f702f72c7b5726515ff09ee99200c5b71e832b6d7b1a0537f6d613b2050839f92466a8f5829892f525013174deeddb720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xsavebox-doc"

RDEPENDS:${PN} += ""

inherit rpm
