SUMMARY = "A simple type of box for LaTeX"
DESCRIPTION = "This small package provides a convenient input syntax for boxes \
that don't break their text over lines automatically, but do \
allow manual line breaks. The boxes shrink to the natural width \
of the longest line they contain."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2asvn30914"

RPM_NAME = "texlive-minibox-2023.209.0.0.2asvn30914-55.1.noarch.rpm"
RPM_HASH = "d05bf5654acd6c901d752aed0f3bcbf3e56c54cd91e7a711b6c0d60e84bfcd6d46909c22c61fe0ba1317f9e958d81cf14f3c1f5745f8dddb6339585123cb8043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minibox.sty \
texlive-minibox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
