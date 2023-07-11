SUMMARY = "Documentation for texlive-engrec"
DESCRIPTION = "This package includes the documentation for texlive-engrec"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-engrec-doc-2023.201.1.1svn15878-53.2.noarch.rpm"
RPM_HASH = "2a953d8d8800777c3c47ee68771d42ac3a6be9dc945cd88c8f174c0f619b2eb3113d8726b26bcbfe3a73dc623bf0e3ba5ebf8a21701f0055c871202c56190d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-engrec-doc"

RDEPENDS:${PN} += ""

inherit rpm
