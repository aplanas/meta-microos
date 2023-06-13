SUMMARY = "Documentation for texlive-odsfile"
DESCRIPTION = "This package includes the documentation for texlive-odsfile"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn65268"

RPM_NAME = "texlive-odsfile-doc-2023.201.0.0.7svn65268-54.1.noarch.rpm"
RPM_HASH = "f824ac9a47cbd76669f7633d57728dad165c5e7bd87044d9b873aef2e389f7bcc5f975843333f504aaf447ff86748104792814dcce77004fc7d3724daf0ff9d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-odsfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
