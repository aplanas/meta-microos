SUMMARY = "To-do notes in a document"
DESCRIPTION = "The package provides to-do notes throughout a document, and \
will provide an index of things to do."
LICENSE = "Apache-1.0"

PV = "2023.201.svn32677"

RPM_NAME = "texlive-easy-todo-2023.201.svn32677-53.2.noarch.rpm"
RPM_HASH = "4acf82ede54f98dc78b8596f0d14e1f02b598f5d3d5954a767c3f70f19b1e40ee58e1baf93b764c6e6d34093eca9dba2dda909cdc595577aa669a4da1e4148f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easy-todo.sty \
texlive-easy-todo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ifdraft.sty \
tex-ifthen.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
