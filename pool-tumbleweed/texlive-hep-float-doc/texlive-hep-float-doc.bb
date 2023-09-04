SUMMARY = "Documentation for texlive-hep-float"
DESCRIPTION = "This package includes the documentation for texlive-hep-float"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64904"

RPM_NAME = "texlive-hep-float-doc-2023.209.1.1svn64904-54.2.noarch.rpm"
RPM_HASH = "8cece77ec14f45d500016c1cb78cb59872e78b552fb23523dc697cd500495d5e828b10f05bec51b75ea24fdce2f167ecd044bf8a0a9ffebf0aff0bb67a086942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-float-doc"

RDEPENDS:${PN} += ""

inherit rpm
