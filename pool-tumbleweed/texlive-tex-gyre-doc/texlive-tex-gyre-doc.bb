SUMMARY = "Documentation for texlive-tex-gyre"
DESCRIPTION = "This package includes the documentation for texlive-tex-gyre"
LICENSE = "LPPL-1.3c"

PV = "2023.209.2.501svn65956"

RPM_NAME = "texlive-tex-gyre-doc-2023.209.2.501svn65956-55.1.noarch.rpm"
RPM_HASH = "e781f23b830e9e4419a5fc3acf2b26d84e4c812683d378e280987ecea5e0abbf7c9acce54b05ff690c8d88636afad94694413656378bdd01b4abf9c4cf9ab944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-gyre-doc"

RDEPENDS:${PN} += ""

inherit rpm
