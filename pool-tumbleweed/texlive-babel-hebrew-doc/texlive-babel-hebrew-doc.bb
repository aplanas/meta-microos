SUMMARY = "Documentation for texlive-babel-hebrew"
DESCRIPTION = "This package includes the documentation for texlive-babel-hebrew"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3hsvn30273"

RPM_NAME = "texlive-babel-hebrew-doc-2023.201.2.3hsvn30273-53.1.noarch.rpm"
RPM_HASH = "f7d492cb7af39ff025b4372cb5581ab1c79f00770559124e010e02e1b89467f48a283aa7c637087d7f6dfa26e73610a9186409f41734a983b92c9f4b59bca3fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-hebrew-doc"

RDEPENDS:${PN} += ""

inherit rpm
