SUMMARY = "Documentation for texlive-notoccite"
DESCRIPTION = "This package includes the documentation for texlive-notoccite"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn18129"

RPM_NAME = "texlive-notoccite-doc-2023.201.svn18129-54.1.noarch.rpm"
RPM_HASH = "5ae6e757eb03cb213a4c7f60a05c4af8c0df299042d60c4393d638c42f98db2d8176488a7e5b3356918ae90531f6384ccb9a1d814cb051cc699fd190628512f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notoccite-doc"
RDEPENDS:${PN} += ""

inherit rpm
