SUMMARY = "Documentation for texlive-epsdice"
DESCRIPTION = "This package includes the documentation for texlive-epsdice"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-epsdice-doc-2023.201.2.1svn15878-53.2.noarch.rpm"
RPM_HASH = "7a9d016200cca8819880755edb806b77a5e4d05267ed99326f7151a0af1201b3937f30f1565d2692efc88c04936220bfeb4939312ac55c8366a086c86f499045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsdice-doc"

RDEPENDS:${PN} += ""

inherit rpm
