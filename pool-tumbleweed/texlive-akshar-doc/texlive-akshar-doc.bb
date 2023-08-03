SUMMARY = "Documentation for texlive-akshar"
DESCRIPTION = "This package includes the documentation for texlive-akshar"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn56277"

RPM_NAME = "texlive-akshar-doc-2023.209.0.0.2svn56277-55.1.noarch.rpm"
RPM_HASH = "1673790d0cb16ae3333ce061947e8bc91cb02920ff0a9216d3e5163bdea57330fc00d3f071260d2e0b0067dfade3b240e0f5b6e6760c0c5eaa6d243f70ea02b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-akshar-doc"

RDEPENDS:${PN} += ""

inherit rpm
