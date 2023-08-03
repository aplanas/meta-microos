SUMMARY = "Documentation for texlive-alkalami"
DESCRIPTION = "This package includes the documentation for texlive-alkalami"
LICENSE = "OFL-1.1"

PV = "2023.209.1.000svn44497"

RPM_NAME = "texlive-alkalami-doc-2023.209.1.000svn44497-55.1.noarch.rpm"
RPM_HASH = "f0e797aa5daa57993aa448ec1f595080415f58e0371ca607b04835a6ad65219ee524f7c098d4910fe74ba3c5038dc7359c797d8c2e645631681c30031cec3105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alkalami-doc"

RDEPENDS:${PN} += ""

inherit rpm
