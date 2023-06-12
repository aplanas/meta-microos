SUMMARY = "Documentation for texlive-mathcommand"
DESCRIPTION = "This package includes the documentation for texlive-mathcommand"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn59512"

RPM_NAME = "texlive-mathcommand-doc-2023.201.1.04svn59512-52.1.noarch.rpm"
RPM_HASH = "5d8d02bd23865a18321330eb19669cdb25713bb6d7b57920132b5c59a0c0d4ea5c45a767be0c85f9146f30054afc5dfab046cbf75143737f289fbc4cd02684e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathcommand-doc"
RDEPENDS:${PN} += ""

inherit rpm
