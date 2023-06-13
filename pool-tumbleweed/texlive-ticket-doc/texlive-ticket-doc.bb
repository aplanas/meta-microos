SUMMARY = "Documentation for texlive-ticket"
DESCRIPTION = "This package includes the documentation for texlive-ticket"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4dsvn42280"

RPM_NAME = "texlive-ticket-doc-2023.201.0.0.4dsvn42280-54.1.noarch.rpm"
RPM_HASH = "cc0a1ccb33f474fc3bb737d21fc2d99644b7642e8b535ac8c155cb60eec9f07dd2b2b5530378ca69716ebade77804a7b5876b1d27f6a36e6a154f69dabdf366a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ticket-doc"

RDEPENDS:${PN} += ""

inherit rpm
