SUMMARY = "Documentation for texlive-changelog"
DESCRIPTION = "This package includes the documentation for texlive-changelog"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5.0svn65861"

RPM_NAME = "texlive-changelog-doc-2023.201.2.5.0svn65861-52.1.noarch.rpm"
RPM_HASH = "6811c1a89f9a11a703e9ba4e0b20f364546056a3cfd0fcf03774bc23eb74362bb08c6626f79b917e1ceb9c3673dcf469b70eb4f77fcd9ac0c1955a1a995533b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changelog-doc"

RDEPENDS:${PN} += ""

inherit rpm
