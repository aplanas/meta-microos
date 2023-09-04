SUMMARY = "Documentation for texlive-easy-todo"
DESCRIPTION = "This package includes the documentation for texlive-easy-todo"
LICENSE = "Apache-1.0"

PV = "2023.209.svn32677"

RPM_NAME = "texlive-easy-todo-doc-2023.209.svn32677-54.2.noarch.rpm"
RPM_HASH = "aeb1a375388f5511e57c6d09154f1acb4acc06487e0c71417a31fb003db21d3d846f1d161f0625b1c5fc348dfdc06ee0fbfcea6d4990703efd8ce97086213210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easy-todo-doc"

RDEPENDS:${PN} += ""

inherit rpm
