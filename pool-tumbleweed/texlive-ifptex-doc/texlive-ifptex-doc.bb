SUMMARY = "Documentation for texlive-ifptex"
DESCRIPTION = "This package includes the documentation for texlive-ifptex"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.2svn62982"

RPM_NAME = "texlive-ifptex-doc-2023.208.2.2svn62982-53.1.noarch.rpm"
RPM_HASH = "2315bbd084458e5d98ad7d5f8c455066fe2a60a77ed6a10116b18a73efbb339dd1c1be9410b35a042a882f10e125e623550157a9176219392eb77a8f0e698f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ifptex-doc-ja \
texlive-ifptex-doc"

RDEPENDS:${PN} += ""

inherit rpm
