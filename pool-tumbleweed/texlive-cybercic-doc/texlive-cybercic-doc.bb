SUMMARY = "Documentation for texlive-cybercic"
DESCRIPTION = "This package includes the documentation for texlive-cybercic"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.1svn37659"

RPM_NAME = "texlive-cybercic-doc-2023.204.2.1svn37659-54.1.noarch.rpm"
RPM_HASH = "34549f642a71efe3a86ce13a3417c75a13ed8ecb95e6bcce02d6c49ac51d8cdc1cfb8cb1d06b961c23ad3544651865f01bb2cbeb00601c81427a14c85a4f2de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cybercic-doc"

RDEPENDS:${PN} += ""

inherit rpm
