SUMMARY = "Documentation for texlive-beamerposter"
DESCRIPTION = "This package includes the documentation for texlive-beamerposter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.13svn54512"

RPM_NAME = "texlive-beamerposter-doc-2023.201.1.13svn54512-53.1.noarch.rpm"
RPM_HASH = "d05d0c10eaafc74bfc2975347de6201839cfd1a61279fe62300d7e793df2e73b89ad44e3df90e825f49f48045dcfc73aef1d49cf83ca80b343814f5285692933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
