SUMMARY = "Documentation for texlive-yagusylo"
DESCRIPTION = "This package includes the documentation for texlive-yagusylo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn29803"

RPM_NAME = "texlive-yagusylo-doc-2023.209.1.2svn29803-53.1.noarch.rpm"
RPM_HASH = "496ed4b7e84d77f9c9957d66762a600202aa30aadd8ff5ef0c83cdb3dd5a8f0869916f5cd08b107cf644b675a8e84ffd92279995f60c412fd67a4a07e9617f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yagusylo-doc-fr;en \
texlive-yagusylo-doc"

RDEPENDS:${PN} += ""

inherit rpm
