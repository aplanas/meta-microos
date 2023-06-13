SUMMARY = "Documentation for texlive-rmathbr"
DESCRIPTION = "This package includes the documentation for texlive-rmathbr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn57173"

RPM_NAME = "texlive-rmathbr-doc-2023.201.1.1.1svn57173-53.1.noarch.rpm"
RPM_HASH = "659e217a19ae96442a0e2c9d366cbe20d322897a95ed1a0e272046b26505fa3cd98d27479216a605a172bb59bee2e6698386ee3bfaaa98df56c90e749fd54677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rmathbr-doc"

RDEPENDS:${PN} += ""

inherit rpm
