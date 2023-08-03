SUMMARY = "Typeset PSTricks examples, with code"
DESCRIPTION = "The (PSTricks-related) package provides an environment \
PSTexample to put code and output side by side or one above the \
other."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.06svn45289"

RPM_NAME = "texlive-pst-exa-2023.209.0.0.06svn45289-53.1.noarch.rpm"
RPM_HASH = "b128a2770775146bc2ec69bb77ac062ac8400071d95fbb4f56eae8fa2aeca2731956d6131d34de919d54c2e48bdb04ab28c2a1334b38a26c82ef76dd02d4fff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-exa.sty \
texlive-pst-exa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-changepage.sty \
tex-etoolbox.sty \
tex-showexpl.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
