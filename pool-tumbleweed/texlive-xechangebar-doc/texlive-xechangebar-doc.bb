SUMMARY = "Documentation for texlive-xechangebar"
DESCRIPTION = "This package includes the documentation for texlive-xechangebar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-xechangebar-doc-2023.209.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "c903100ac162fb77ca911aa164cd666957c229ce8760deb9ebb40fced4e0cd5af74f4a0537452d8a5b1850a2edc2c9d5d03fa60b62b1a4b61c2bd8037edc2777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xechangebar-doc"

RDEPENDS:${PN} += ""

inherit rpm
