SUMMARY = "Documentation for texlive-xcolor-solarized"
DESCRIPTION = "This package includes the documentation for texlive-xcolor-solarized"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn61719"

RPM_NAME = "texlive-xcolor-solarized-doc-2023.209.0.0.4svn61719-53.1.noarch.rpm"
RPM_HASH = "d967128b50a2ccd97431c9177a8f00961ce6505e66903ccef753d56e208050f7af2aad56e13f423366a66ae98fe85c615637e51dc70031ce5c3a9cc200a31e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-solarized-doc"

RDEPENDS:${PN} += ""

inherit rpm
