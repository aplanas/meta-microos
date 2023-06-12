SUMMARY = "Documentation for texlive-colorist"
DESCRIPTION = "This package includes the documentation for texlive-colorist"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66434"

RPM_NAME = "texlive-colorist-doc-2023.201.svn66434-53.1.noarch.rpm"
RPM_HASH = "d40231f3e998ade87db3a3756dda205ed80e3477cd26daeee105ce250707a9aae49014cf86c4f22918897283ccb9d56ee432628c6734867f2d7e260734576542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorist-doc"
RDEPENDS:${PN} += ""

inherit rpm
