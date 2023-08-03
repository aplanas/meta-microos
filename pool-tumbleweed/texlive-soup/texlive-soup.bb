SUMMARY = "Generate alphabet soup puzzles"
DESCRIPTION = "Generate alphabet soup puzzles (aka word search puzzles), and \
variations using numbers or other symbols. Provides macros to \
generate an alphabet soup style puzzle (also known as word \
search puzzles or 'find-the-word' puzzles). Allow creating \
numbersoup and soups with custom symbol sets."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn50815"

RPM_NAME = "texlive-soup-2023.209.1.0.2svn50815-58.1.noarch.rpm"
RPM_HASH = "b019ea33a004e2bc3673582968d8ec8814764ab6e4a8eb9cc0226fb42974fe3705902530f438e00f74ee228e27a0d85bc7ae35818962594563510ffcec8b610e"
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
