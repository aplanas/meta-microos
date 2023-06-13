SUMMARY = "Documentation for texlive-beamer-verona"
DESCRIPTION = "This package includes the documentation for texlive-beamer-verona"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn39180"

RPM_NAME = "texlive-beamer-verona-doc-2023.201.0.0.2svn39180-53.1.noarch.rpm"
RPM_HASH = "3b4228a7e3b871e97919db05383c6c7f1edcf66a24ac41f554257819e126dedc7777eee5e736441a4a7a008e60c4e9b4b6af3db834932846721bc42d18bd4fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-verona-doc"

RDEPENDS:${PN} += ""

inherit rpm
