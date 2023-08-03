SUMMARY = "Documentation for texlive-todo"
DESCRIPTION = "This package includes the documentation for texlive-todo"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.142svn17746"

RPM_NAME = "texlive-todo-doc-2023.209.2.142svn17746-53.1.noarch.rpm"
RPM_HASH = "6f2b28a3ff9971a31fe1fd2216b5329c97a47c0a51d0e871efdf2c7546b1e80559008616c82adad8fb86fac1bb3aee0f4893f3fda6f36f6ce35336ce439f9fa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-todo-doc"

RDEPENDS:${PN} += ""

inherit rpm
