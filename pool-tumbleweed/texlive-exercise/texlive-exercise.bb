SUMMARY = "Typeset exercises, problems, etc. and their answers"
DESCRIPTION = "The package helps to typeset exercises or list of exercises \
within any document. Exercises, questions and sub-questions are \
automatically numbered. It is possible to put answers in the \
same document, and display them immediatly, later in the \
document or not to print answers at all. The layout of \
exercises is fully customisable. It is possible to typeset long \
problems, short exercises, questionnaires, etc. Usage of the \
babel package is detected, but not fully supported yet (only \
English and French are implemented)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn35417"

RPM_NAME = "texlive-exercise-2023.201.1.6svn35417-52.1.noarch.rpm"
RPM_HASH = "cae7054796295ca80a71e0206ad4c279913ca4c4b71410df3d7e9a5a514fd6b61f7c8074be248162c5ad222c047e0c7331013d20b43e1e71b8a890e3a4f835fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exercise.sty \
texlive-exercise"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
