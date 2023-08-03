SUMMARY = "To-do notes in a document"
DESCRIPTION = "The package provides to-do notes throughout a document, and \
will provide an index of things to do."
LICENSE = "Apache-1.0"

PV = "2023.209.svn32677"

RPM_NAME = "texlive-easy-todo-2023.209.svn32677-54.1.noarch.rpm"
RPM_HASH = "e52a64296e5cac7a39d5698ffd57ad7e1e52bfe6dbaa76fc779fdafc3a6179ca480f931016d47fe5b8387bcb9579d8c62477169cde93be4ce160c394dc521bc0"
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
