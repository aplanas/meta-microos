SUMMARY = "Generate alphabet soup puzzles"
DESCRIPTION = "Generate alphabet soup puzzles (aka word search puzzles), and \
variations using numbers or other symbols. Provides macros to \
generate an alphabet soup style puzzle (also known as word \
search puzzles or 'find-the-word' puzzles). Allow creating \
numbersoup and soups with custom symbol sets."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn50815"

RPM_NAME = "texlive-soup-2023.201.1.0.2svn50815-57.1.noarch.rpm"
RPM_HASH = "23074f5d71d6e005cbc22edd3f9cd122483bfcc76565c2304d7dd152e2a46c4fab7e123169046a6a1f31b8113c319604a3fd099dad881d2ca7419347ed64bdd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-soup.sty \
texlive-soup"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
