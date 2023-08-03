SUMMARY = "Documentation for texlive-etaremune"
DESCRIPTION = "This package includes the documentation for texlive-etaremune"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-etaremune-doc-2023.209.1.2svn15878-53.1.noarch.rpm"
RPM_HASH = "f462ff230811470c5771d8733368ae21f45824dc1859263ff5cb502a8cad735cec3b011a716f6a30e4b175f04e02d812cf2dbacfc48d5c7fcde6ffc9fd9a8600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etaremune-doc"

RDEPENDS:${PN} += ""

inherit rpm
