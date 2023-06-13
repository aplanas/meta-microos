SUMMARY = "Documentation for texlive-coordsys"
DESCRIPTION = "This package includes the documentation for texlive-coordsys"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.4svn15878"

RPM_NAME = "texlive-coordsys-doc-2023.204.1.4svn15878-54.1.noarch.rpm"
RPM_HASH = "70dd8f3905c0500b6f02be6310d55ef177e8577dc08be16fc1f2edee3156073eb30a886b2eb008634089c9ce73030e926a9e19f224bb3d0747613dc7bd71d467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coordsys-doc"

RDEPENDS:${PN} += ""

inherit rpm
