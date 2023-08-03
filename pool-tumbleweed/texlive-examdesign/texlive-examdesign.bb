SUMMARY = "LaTeX class for typesetting exams"
DESCRIPTION = "This bundle provides a class examdesign. The class provides \
several features useful for designing tests or question sets: \
it allows for explicit markup of questions and answers; the \
class will, at the user's request, automatically generate \
answer keys; multiple versions of the same test can be \
generated automatically, with the ordering of questions within \
each section randomly permuted so as to minimize cheating; the \
generated answer keys can be constructed either with or without \
the questions included; environments are provided to assist in \
constructing the most common types of test question: matching, \
true/false, multiple-choice, fill-in-the-blank, and short \
answer/essay questions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.101svn15878"

RPM_NAME = "texlive-examdesign-2023.209.1.101svn15878-53.1.noarch.rpm"
RPM_HASH = "57cb4e3e536a6edae1ea2dcc7b21469b36cf45bac089bb9ea998af5c17159464a002cd67d8627fb756154eabf20fef720b5d9a9ed7f61fc32efd10d65d1c1cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-examdesign.cls \
texlive-examdesign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-enumerate.sty \
tex-keyval.sty \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
