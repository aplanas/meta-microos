SUMMARY = "Documentation for texlive-addlines"
DESCRIPTION = "This package includes the documentation for texlive-addlines"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn49326"

RPM_NAME = "texlive-addlines-doc-2023.209.0.0.3svn49326-55.1.noarch.rpm"
RPM_HASH = "e6545cc61ccf75176dd1cf89b353922a5af86bf110138d8d517a9e662e6118f5992a2ac7ea3007c069423b57aa624853d9e97e49c8d9a1feb7e5cb0faeefff85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-addlines-doc"

RDEPENDS:${PN} += ""

inherit rpm
