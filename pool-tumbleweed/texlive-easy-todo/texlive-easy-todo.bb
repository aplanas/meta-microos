SUMMARY = "To-do notes in a document"
DESCRIPTION = "The package provides to-do notes throughout a document, and \
will provide an index of things to do."
LICENSE = "Apache-1.0"

PV = "2023.209.svn32677"

RPM_NAME = "texlive-easy-todo-2023.209.svn32677-54.2.noarch.rpm"
RPM_HASH = "530cd756f3641a4448a601661346e048fc5bc2ef0e3a0d6e195fdc6d80436ae988b9c50e734006c733c94144f70ada01872e6988697a5b07bc2a3574e5ba92db"
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
