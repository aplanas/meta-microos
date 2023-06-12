SUMMARY = "Documentation for texlive-locality"
DESCRIPTION = "This package includes the documentation for texlive-locality"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn20422"

RPM_NAME = "texlive-locality-doc-2023.201.0.0.2svn20422-54.1.noarch.rpm"
RPM_HASH = "51e76494ddb0a8084f0671248fa30f2c16578095c785cf332968b7bdca90bd9fdfc20d079dfe7687ce97f3e8b5d4ff7676cfe53c0b54b8d932e0113eee4bfdee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-locality-doc"
RDEPENDS:${PN} += ""

inherit rpm
