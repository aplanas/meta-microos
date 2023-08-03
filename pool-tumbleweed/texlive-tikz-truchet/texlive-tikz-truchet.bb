SUMMARY = "Draw Truchet tiles"
DESCRIPTION = "This is a package for LaTeX that draws Truchet tiles, as used \
in Colin Beveridge's article Too good to be Truchet in issue 08 \
of Chalkdust."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn50020"

RPM_NAME = "texlive-tikz-truchet-2023.209.svn50020-53.1.noarch.rpm"
RPM_HASH = "3cbc800a1bf0860c787e48875e206cd3baad339552a4ead0685da58c65e4ca1c3fdec5e1defb4f613cd22dc2eb798d9ea0d0e8d0540fa518adbb025a62861544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-truchet.sty \
texlive-tikz-truchet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
