SUMMARY = "Documentation for texlive-sectsty"
DESCRIPTION = "This package includes the documentation for texlive-sectsty"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.2svn15878"

RPM_NAME = "texlive-sectsty-doc-2023.201.2.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "8a36cc2b1bc461a940dd0975cd8c591e9fe6f3ae146bfade2c84ae4cf4da684e19b39b1337945bea494fc4c86b03c30243466dd32002adc1e4d7f770b13e0deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sectsty-doc"

RDEPENDS:${PN} += ""

inherit rpm
