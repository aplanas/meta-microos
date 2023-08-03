SUMMARY = "Documentation for texlive-minifp"
DESCRIPTION = "This package includes the documentation for texlive-minifp"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.96svn32559"

RPM_NAME = "texlive-minifp-doc-2023.209.0.0.96svn32559-55.1.noarch.rpm"
RPM_HASH = "a3bde0a5a9dbde5417efe0cc02da705e06bd2cef7581ffadd0fac39d9be2b9c25b076904ef60cb5c705fa0a43e7bd485f3aeb25970b9490c2852e9886e5f69b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minifp-doc"

RDEPENDS:${PN} += ""

inherit rpm
