SUMMARY = "Documentation for texlive-phffullpagefigure"
DESCRIPTION = "This package includes the documentation for texlive-phffullpagefigure"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn41857"

RPM_NAME = "texlive-phffullpagefigure-doc-2023.209.1.0svn41857-52.1.noarch.rpm"
RPM_HASH = "0526f257f2e6e616cfbf181282c5da1b35ebf24af212467bdb050e9b5f922242e572baaabc2fcd3b02003b51eb5deb2399cbfd5995246ca48db8264f8934a0d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phffullpagefigure-doc"

RDEPENDS:${PN} += ""

inherit rpm
