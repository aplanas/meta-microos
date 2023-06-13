SUMMARY = "Documentation for texlive-democodetools"
DESCRIPTION = "This package includes the documentation for texlive-democodetools"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1betasvn64314"

RPM_NAME = "texlive-democodetools-doc-2023.201.1.0.1betasvn64314-52.1.noarch.rpm"
RPM_HASH = "96cfbecdf4ba8c0cd4eb4fb79f5b143a5412a5c4c68394b3e15e611d61fab79e4b10814de2b7ababc7f7dbe8ce243f17a57f00bcdd63c537b8cffed61f186c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-democodetools-doc"

RDEPENDS:${PN} += ""

inherit rpm
