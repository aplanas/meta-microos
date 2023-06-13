SUMMARY = "Documentation for texlive-interpreter"
DESCRIPTION = "This package includes the documentation for texlive-interpreter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn27232"

RPM_NAME = "texlive-interpreter-doc-2023.201.1.2svn27232-52.1.noarch.rpm"
RPM_HASH = "a072100a824a794031aeca4143e1a9239f26aaba7c4cac95ae106486f5bd9a55361687b9c6af863147f6ee11c80f74f32d48c798db31f6163bf90f2cc1dd95d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interpreter-doc"

RDEPENDS:${PN} += ""

inherit rpm
