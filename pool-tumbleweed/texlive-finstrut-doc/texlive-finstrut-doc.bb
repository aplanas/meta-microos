SUMMARY = "Documentation for texlive-finstrut"
DESCRIPTION = "This package includes the documentation for texlive-finstrut"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn21719"

RPM_NAME = "texlive-finstrut-doc-2023.201.0.0.5svn21719-52.1.noarch.rpm"
RPM_HASH = "9893ea8ce6fa5123c38774540720579f1e80bd5bb1c467a6698736bc69a6ea6645bc151e61c6e15015fdd938a5031197f2a7e5138a7f77249a69f2561342e43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-finstrut-doc"

RDEPENDS:${PN} += ""

inherit rpm
