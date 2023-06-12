SUMMARY = "Documentation for texlive-els-cas-templates"
DESCRIPTION = "This package includes the documentation for texlive-els-cas-templates"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn62931"

RPM_NAME = "texlive-els-cas-templates-doc-2023.201.2.3svn62931-53.1.noarch.rpm"
RPM_HASH = "bafdaab01851fa2d2794544d304af9ebaa70bd6daebc96d60f3f130559eb511fb1402d596622c1c3f82132e9999ac9bee48614206c8c00a93c297e8cafe3f0d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-els-cas-templates-doc"
RDEPENDS:${PN} += ""

inherit rpm
