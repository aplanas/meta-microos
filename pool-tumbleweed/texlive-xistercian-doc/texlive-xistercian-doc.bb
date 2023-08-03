SUMMARY = "Documentation for texlive-xistercian"
DESCRIPTION = "This package includes the documentation for texlive-xistercian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61366"

RPM_NAME = "texlive-xistercian-doc-2023.209.1.2svn61366-53.1.noarch.rpm"
RPM_HASH = "098118726b67663cd8c4f427c5f599ac1fcb974a42a514923eb5805b49f31da361fbd6c318a9798b571048267073442751959878feb15fb1c2b5b6d342f087be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xistercian-doc"

RDEPENDS:${PN} += ""

inherit rpm
