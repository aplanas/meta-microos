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

PV = "2023.201.1.101svn15878"

RPM_NAME = "texlive-examdesign-2023.201.1.101svn15878-52.1.noarch.rpm"
RPM_HASH = "feb18e83d99cc2293c4277d0f54f0532c32c4aa1a76daeafc9e1f4396bacbdbf1952daeb12157a4ff168124791f6a9a64dd8467ad837f514c9b7b3a54c534bf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-examdesign.cls \
texlive-examdesign"

RDEPENDS:${PN} += "/bin/sh \
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
