SUMMARY = "Documentation for texlive-handoutwithnotes"
DESCRIPTION = "This package includes the documentation for texlive-handoutwithnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62140"

RPM_NAME = "texlive-handoutwithnotes-doc-2023.201.1.3svn62140-53.2.noarch.rpm"
RPM_HASH = "46a1edc697890347b33a43570d62536fd376dd84ea364017d88e3200346ced338305b073e3675695c36acba0b162713ef914aaf3c2c1f313393cbbb151b3f5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handoutwithnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
