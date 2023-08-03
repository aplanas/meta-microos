SUMMARY = "Documentation for texlive-cases"
DESCRIPTION = "This package includes the documentation for texlive-cases"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn54682"

RPM_NAME = "texlive-cases-doc-2023.209.3.2svn54682-53.1.noarch.rpm"
RPM_HASH = "6f159a21b644fad90bbd38c89bada969487cc0d08cb5cc914adea85af4d2eb94ede8af55335936fd7e2e3e134eb4e626c3308e7c5ed8ea268e60ea50be85396b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cases-doc"

RDEPENDS:${PN} += ""

inherit rpm
