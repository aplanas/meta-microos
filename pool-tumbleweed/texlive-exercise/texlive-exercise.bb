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

PV = "2023.209.1.6svn35417"

RPM_NAME = "texlive-exercise-2023.209.1.6svn35417-53.1.noarch.rpm"
RPM_HASH = "ea25506e471e6acc01460ba290ff89ad6b2e8f3a34d9ae49962a11e1ac5911e6611ff6ecb9efbe7e878c090e79564a241d8db858a62d184361e442c95714f33c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exercise.sty \
texlive-exercise"

RDEPENDS:${PN} += "/usr/bin/sh \
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
