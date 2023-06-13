SUMMARY = "Documentation for texlive-aurical"
DESCRIPTION = "This package includes the documentation for texlive-aurical"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-aurical-doc-2023.201.1.5svn15878-53.1.noarch.rpm"
RPM_HASH = "14fb0a78cd79fe7b842a5d2fa83b3f269cc1a5c00361ba26525a631a004c9a48f17de124c383514362159e8f2699056f99c888969ce4449fa25e4e134b5d35b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aurical-doc"

RDEPENDS:${PN} += ""

inherit rpm
