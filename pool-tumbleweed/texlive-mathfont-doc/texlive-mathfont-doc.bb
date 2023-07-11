SUMMARY = "Documentation for texlive-mathfont"
DESCRIPTION = "This package includes the documentation for texlive-mathfont"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.2asvn65205"

RPM_NAME = "texlive-mathfont-doc-2023.208.2.2asvn65205-53.1.noarch.rpm"
RPM_HASH = "06be349ad7dd30c47c6c0e7facd8b1fea03021641c49fcc4b4016a5ea5fbede839c31d26647e19dc907346734550f42b5fc3b56ea33566f5b861cf50f280bec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
