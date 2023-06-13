SUMMARY = "Documentation for texlive-ot-tableau"
DESCRIPTION = "This package includes the documentation for texlive-ot-tableau"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59318"

RPM_NAME = "texlive-ot-tableau-doc-2023.201.svn59318-54.1.noarch.rpm"
RPM_HASH = "349be598eba48a7b88cfbfeec8f49894af416d97ef5ac9e2be9a93e9434401834d822f9f222cc8470fde1f2dba59fedf32a3293bdf077e92222979109e55f485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ot-tableau-doc"

RDEPENDS:${PN} += ""

inherit rpm
