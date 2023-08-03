SUMMARY = "A collection of packages by Francesco Bosisio"
DESCRIPTION = "A collection of packages containing: accenti dblfont; envmath; \
evenpage; graphfig; mathcmd; quotes; and sobolev."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn16989"

RPM_NAME = "texlive-bosisio-2023.209.svn16989-53.1.noarch.rpm"
RPM_HASH = "c02c338157904d3e5b4fd337d0b45717d478ffdd5c9c24dfd12c97f782bb2e8112ba02bb2e278e709642457ac9334dbc49437091ca9f35463174b55568e7017d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-accenti.sty \
tex-dblfont.sty \
tex-envmath.sty \
tex-evenpage.sty \
tex-graphfig.sty \
tex-mathcmd.sty \
tex-quotes.sty \
tex-sobolev.sty \
texlive-bosisio"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-graphics.sty \
tex-subfigure.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
