SUMMARY = "Documentation for texlive-tidyres"
DESCRIPTION = "This package includes the documentation for texlive-tidyres"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn65789"

RPM_NAME = "texlive-tidyres-doc-2023.209.1.0.0svn65789-55.1.noarch.rpm"
RPM_HASH = "1b44882141377cbe0536d611d08a5a72077300362dad1f2fed0836e23c8c5b408db3312eeae4297a4a9c6887335904e16fb496893521ab2ed501d58d057c1c27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tidyres-doc"

RDEPENDS:${PN} += ""

inherit rpm
