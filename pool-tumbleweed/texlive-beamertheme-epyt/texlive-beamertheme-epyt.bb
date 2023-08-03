SUMMARY = "A simple and clean theme for LaTeX beamer class"
DESCRIPTION = "This package provides a simple but nice theme for Beamer, with \
the following features: simple structure: with page numbers at \
footer, no head bar and side bar simple templates: displaying \
theorems with traditional inline style simple colors: using \
only several foreground and background colors"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn41404"

RPM_NAME = "texlive-beamertheme-epyt-2023.209.1.0svn41404-54.1.noarch.rpm"
RPM_HASH = "3c03991c4cbf7b9cf02a01b2019814577a1061c915988fd091d7eb3bf64d63e4c21a3a0dfa5314bee1db13f1334def27a969fe0c710184966a5ea72fb91b7b6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeepyt.sty \
texlive-beamertheme-epyt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arev.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
