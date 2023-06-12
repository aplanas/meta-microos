SUMMARY = "Documentation for texlive-properties"
DESCRIPTION = "This package includes the documentation for texlive-properties"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-properties-doc-2023.201.0.0.2svn15878-52.1.noarch.rpm"
RPM_HASH = "ccfb2dafd292d2b233fccec087ee45a459f7d72f086b38a3120799dce5ceddbf893c3b55c26078c73c349214589f6928d3af1545526c7eacca1f31fe65e6baac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-properties-doc"
RDEPENDS:${PN} += ""

inherit rpm
