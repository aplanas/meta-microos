SUMMARY = "Documentation for texlive-pst-bar"
DESCRIPTION = "This package includes the documentation for texlive-pst-bar"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.93svn64331"

RPM_NAME = "texlive-pst-bar-doc-2023.201.0.0.93svn64331-52.1.noarch.rpm"
RPM_HASH = "f778c4904698baf54c30523a4abdbad3eefb94593e601a7d56b37015b92bea7d17fc7d579e499708831bcc2c8450be1d256290af77ecb18d952b45eb095a2f6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-bar-doc"

RDEPENDS:${PN} += ""

inherit rpm
