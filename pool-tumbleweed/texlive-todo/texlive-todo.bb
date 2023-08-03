SUMMARY = "Make a to-do list for a document"
DESCRIPTION = "The package allows you to insert 'to do' marks in your \
document, to make lists of such items, and to cross-reference \
to them."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.142svn17746"

RPM_NAME = "texlive-todo-2023.209.2.142svn17746-53.1.noarch.rpm"
RPM_HASH = "14c22e5f1f5265d2bb99df5802d6856b0cf6c57717e41ae85b67b63d2bb17a5dc31afa468d2e556cd1ab61e8fa409bb67037232438b39c0c4cfb5bc73d356a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-todo.sty \
texlive-todo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
