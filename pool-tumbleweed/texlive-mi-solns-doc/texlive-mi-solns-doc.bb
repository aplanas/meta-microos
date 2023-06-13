SUMMARY = "Documentation for texlive-mi-solns"
DESCRIPTION = "This package includes the documentation for texlive-mi-solns"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn49651"

RPM_NAME = "texlive-mi-solns-doc-2023.201.0.0.6svn49651-54.1.noarch.rpm"
RPM_HASH = "41cf8b40baa5d8ded895e800eda4c6903f912e46dd4dc31e1635183bd336f0c95cf061769816f776b93a9e3c2e3cb3852e5b077c52ebf14d0a67800da8eb53df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mi-solns-doc"

RDEPENDS:${PN} += ""

inherit rpm
