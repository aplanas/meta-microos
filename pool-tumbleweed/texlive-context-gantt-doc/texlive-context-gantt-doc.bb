SUMMARY = "Documentation for texlive-context-gantt"
DESCRIPTION = "This package includes the documentation for texlive-context-gantt"
LICENSE = "SUSE-Public-Domain"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-gantt-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "fe211ee01ff33d5c115e2967e1ffb3cb2b42c589fb215df6389fdda49efc47f12b5e398cd853868a554d9931fed4915193ac51dd68f34e86bf5323c43ffa640c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-gantt-doc"

RDEPENDS:${PN} += ""

inherit rpm
