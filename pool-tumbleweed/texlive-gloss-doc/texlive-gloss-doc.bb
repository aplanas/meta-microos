SUMMARY = "Documentation for texlive-gloss"
DESCRIPTION = "This package includes the documentation for texlive-gloss"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.2svn15878"

RPM_NAME = "texlive-gloss-doc-2023.201.1.5.2svn15878-53.2.noarch.rpm"
RPM_HASH = "041fa55625a857307ee1e6964c7a37f535b6bbd49ec92cfa696a3c19d6011136e33e8cf3c45a355091ee99f05b375ae4c20f5feb72ca9303b24d2404cc4c4467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-doc"

RDEPENDS:${PN} += ""

inherit rpm
