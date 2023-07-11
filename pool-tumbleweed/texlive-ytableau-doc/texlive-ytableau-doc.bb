SUMMARY = "Documentation for texlive-ytableau"
DESCRIPTION = "This package includes the documentation for texlive-ytableau"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn59580"

RPM_NAME = "texlive-ytableau-doc-2023.201.1.4svn59580-52.2.noarch.rpm"
RPM_HASH = "122fb5d522a4693ed56a152f71fe89ac52c69914623692c9d327a5811f1a04f5e53ed69634fd1a8723d8f0f570e50b873aa0408b630f278481bfb161dd0f48c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ytableau-doc"

RDEPENDS:${PN} += ""

inherit rpm
