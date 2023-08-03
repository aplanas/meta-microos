SUMMARY = "Documentation for texlive-easy-todo"
DESCRIPTION = "This package includes the documentation for texlive-easy-todo"
LICENSE = "Apache-1.0"

PV = "2023.209.svn32677"

RPM_NAME = "texlive-easy-todo-doc-2023.209.svn32677-54.1.noarch.rpm"
RPM_HASH = "37d6de8ecfac353b985d0a154f7938762d1569d8b66d60526382084fa1beee673eb3b972601459c779b5cbd35b1afc74464c2f472db50287d074cf39302e23ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easy-todo-doc"

RDEPENDS:${PN} += ""

inherit rpm
