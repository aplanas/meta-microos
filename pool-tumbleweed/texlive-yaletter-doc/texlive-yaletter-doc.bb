SUMMARY = "Documentation for texlive-yaletter"
DESCRIPTION = "This package includes the documentation for texlive-yaletter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42830"

RPM_NAME = "texlive-yaletter-doc-2023.201.1.1svn42830-52.2.noarch.rpm"
RPM_HASH = "f26ddbb36cf237811a0480137f5e775efdd0e2ca23d284a9f8648389d475c465a06b95d433ca1569ef5f7032ed5552b35fdb1e253c4ad650f936887f23603ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yaletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
