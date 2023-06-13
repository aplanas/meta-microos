SUMMARY = "Documentation for texlive-todo"
DESCRIPTION = "This package includes the documentation for texlive-todo"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.142svn17746"

RPM_NAME = "texlive-todo-doc-2023.201.2.142svn17746-52.1.noarch.rpm"
RPM_HASH = "e5bb8d58910d0829934cbfb47a048c1c9310714fc70af915b1eaa3ac0a7f344bd399ba02abc179b9b7d60f782b5ce151ec90c061a32a15811b888ded6a141be2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-todo-doc"

RDEPENDS:${PN} += ""

inherit rpm
