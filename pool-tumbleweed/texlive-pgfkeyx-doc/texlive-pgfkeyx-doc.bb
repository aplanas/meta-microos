SUMMARY = "Documentation for texlive-pgfkeyx"
DESCRIPTION = "This package includes the documentation for texlive-pgfkeyx"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1svn26093"

RPM_NAME = "texlive-pgfkeyx-doc-2023.201.0.0.0.1svn26093-51.1.noarch.rpm"
RPM_HASH = "ce29fef78a235490fd181484e7afbf5b475b8ca8f68f13f369a121330f40e4285e4bb4e037f7c901154807e4e5cfbec7f4d423154a426b5b308678391ed094f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfkeyx-doc"

RDEPENDS:${PN} += ""

inherit rpm
