SUMMARY = "A class for typesetting flashcards"
DESCRIPTION = "The FlashCards class provides for the typesetting of flash \
cards. By flash card, we mean a two sided card which has a \
prompt or a question on one side and the response or the answer \
on the flip (back) side. Flash cards come in many sizes \
depending on the nature of the information they contain."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0.2svn62104"

RPM_NAME = "texlive-flashcards-2023.201.1.0.2svn62104-52.1.noarch.rpm"
RPM_HASH = "0557faec68cbfec18a12c520fe53fbdb3e156dbcf3ab2d71b16025677104f5c9d9b44af3e6e7138413dcbb71f1130d6a06099e03bf46a9e08a866910b9a8bfe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-avery5371.cfg \
tex-avery5388.cfg \
tex-flashcards.cls \
texlive-flashcards"

RDEPENDS:${PN} += "/bin/sh \
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
