SUMMARY = "Documentation for texlive-filehook"
DESCRIPTION = "This package includes the documentation for texlive-filehook"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8bsvn64822"

RPM_NAME = "texlive-filehook-doc-2023.201.0.0.8bsvn64822-52.1.noarch.rpm"
RPM_HASH = "160b2a823ca49b7068e1abb56d7a4796a54e524aea5c819c47ac7c1fea7fa7dcfc89a63c36eac3cecd93d317396f5bd2b1c12c485dcdacfdc6cd78fa1e97574b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filehook-doc"
RDEPENDS:${PN} += ""

inherit rpm
