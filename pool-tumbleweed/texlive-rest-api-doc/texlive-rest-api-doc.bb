SUMMARY = "Documentation for texlive-rest-api"
DESCRIPTION = "This package includes the documentation for texlive-rest-api"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn57068"

RPM_NAME = "texlive-rest-api-doc-2023.201.1.4svn57068-53.1.noarch.rpm"
RPM_HASH = "bb71226341b8241c67777249fc43f8fea2b94a6c877e25b2ebd7fddc8771028f4f947314c2e12f846771aa8f13c79c3ad89b4fae6ba58cf6476752f7212efff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rest-api-doc"

RDEPENDS:${PN} += ""

inherit rpm
