SUMMARY = "Documentation for texlive-tokcycle"
DESCRIPTION = "This package includes the documentation for texlive-tokcycle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.42svn60320"

RPM_NAME = "texlive-tokcycle-doc-2023.209.1.42svn60320-53.1.noarch.rpm"
RPM_HASH = "3ba0e254f35efa460386a56ad3a39497c7742b224ec8ad060caa3ae1af990a80f22e886d79da7dd9194ac3508590ea2e696f1681381f99dd0b08337f65a8cf51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tokcycle-doc"

RDEPENDS:${PN} += ""

inherit rpm
