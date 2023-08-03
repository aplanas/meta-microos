SUMMARY = "A class for typesetting flashcards"
DESCRIPTION = "The FlashCards class provides for the typesetting of flash \
cards. By flash card, we mean a two sided card which has a \
prompt or a question on one side and the response or the answer \
on the flip (back) side. Flash cards come in many sizes \
depending on the nature of the information they contain."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.2svn62104"

RPM_NAME = "texlive-flashcards-2023.209.1.0.2svn62104-53.1.noarch.rpm"
RPM_HASH = "40fe184276407bfe13237969a291535946726cbaffe94268f32eaab514400bd3d2abbcaadc69dfd0a1eb8e39c225a238595f24612da71d95b1906bc55ca4b918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-avery5371.cfg \
tex-avery5388.cfg \
tex-flashcards.cls \
texlive-flashcards"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-geometry.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
