SUMMARY = "Documentation for texlive-biblatex-anonymous"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-anonymous"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6.2svn48548"

RPM_NAME = "texlive-biblatex-anonymous-doc-2023.209.2.6.2svn48548-54.1.noarch.rpm"
RPM_HASH = "e37e687094fb4040f76c3179c7cda6fae1715716572da5cf230a6df3dcc426966a9cd3fb339bc292a552a1addb1d1087c9578188549c3939fc1dedcbc791dcba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-anonymous-doc"

RDEPENDS:${PN} += ""

inherit rpm
