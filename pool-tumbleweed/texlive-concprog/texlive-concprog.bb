SUMMARY = "Concert programmes"
DESCRIPTION = "A class which provides the necessary macros to prepare a \
(classical) concert programme; a sample is provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn18791"

RPM_NAME = "texlive-concprog-2023.209.svn18791-54.1.noarch.rpm"
RPM_HASH = "2e209088732581768644bd9cf7fa717d6300e1cba7e02c85b81ea75c882018497a6ebf2105b0533a4a393951f7093adcee7692595890da7d7b697c7e521c0a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ConcProg.cls \
texlive-concprog"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
