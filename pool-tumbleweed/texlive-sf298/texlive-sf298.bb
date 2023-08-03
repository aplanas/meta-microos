SUMMARY = "Standard form 298"
DESCRIPTION = "A LaTeX package for generating a completed standard form 298 \
(Rev. 8-98) as prescribed by ANSI Std. Z39.18 for report \
documentation as part of a document delivered, for instance, on \
a U.S. government contract."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn41653"

RPM_NAME = "texlive-sf298-2023.209.1.3svn41653-54.1.noarch.rpm"
RPM_HASH = "b071a67769971b73dde8cd7823ada18946967095ebf30b7fb315a1b9208e3045e178184f63a391301485290c8f358c37b5804bc846b0a415882d5a0a0462cb7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sf298.sty \
texlive-sf298"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-multicol.sty \
tex-totpages.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
