SUMMARY = "Documentation for texlive-mynsfc"
DESCRIPTION = "This package includes the documentation for texlive-mynsfc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.30svn60280"

RPM_NAME = "texlive-mynsfc-doc-2023.201.1.30svn60280-54.1.noarch.rpm"
RPM_HASH = "7f06f6e2f79076731976995e42337f93ccaaf209e8f1549beac8ad17f1c1a844033a1a4701d9e0668862844ceefae436d879a546c631b37c300453c66ec9950a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mynsfc-doc"

RDEPENDS:${PN} += ""

inherit rpm
