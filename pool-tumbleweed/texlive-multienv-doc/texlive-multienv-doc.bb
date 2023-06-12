SUMMARY = "Documentation for texlive-multienv"
DESCRIPTION = "This package includes the documentation for texlive-multienv"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn64967"

RPM_NAME = "texlive-multienv-doc-2023.201.1.0svn64967-54.1.noarch.rpm"
RPM_HASH = "389a2b2e1a66eab0dfc9130f3fd59d7b015b636218120ed932201842246e7e6a910e779c8fefe4ddfad9718a37fdfe92ad232a63fd7f0898ad7ffdeb9484c492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multienv-doc"
RDEPENDS:${PN} += ""

inherit rpm
