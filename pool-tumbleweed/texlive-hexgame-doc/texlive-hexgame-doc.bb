SUMMARY = "Documentation for texlive-hexgame"
DESCRIPTION = "This package includes the documentation for texlive-hexgame"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hexgame-doc-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "b47dbd2843a8b071ff34b953d516fdab65ab8e3b8260c14f77ac839ed37c459576dbd74517e6055bbf403d2fa3b97b52ba7a8b3e17160dacd151acad618e3f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hexgame-doc"

RDEPENDS:${PN} += ""

inherit rpm
