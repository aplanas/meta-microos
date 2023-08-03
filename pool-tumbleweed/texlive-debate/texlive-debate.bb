SUMMARY = "Debates between reviewers"
DESCRIPTION = "This package helps to organize debates between multiple \
reviewers of a paper within the text."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.1svn64846"

RPM_NAME = "texlive-debate-2023.209.0.0.2.1svn64846-53.1.noarch.rpm"
RPM_HASH = "73aeffcec0a40981424910078d0e7b797a899eb5514787678aeb9e4c976f203c2af6e9c67b38e947454fc5bc138680dcb794bb12c0d171f5456ae3dc986a96b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-debate.sty \
texlive-debate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-listings \
texlive-listingsutf8 \
texlive-pdfcol \
texlive-scripts \
texlive-scripts-bin \
texlive-tcolorbox \
texlive-xcolor \
texlive-xkeyval"

inherit rpm
