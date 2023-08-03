SUMMARY = "Draw timing diagrams"
DESCRIPTION = "The package provides commands to draw and annotate various \
kinds of timing diagrams, using Tikz. Documentation is sparse, \
but the source and the examples file should be of some use."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn31491"

RPM_NAME = "texlive-timing-diagrams-2023.209.svn31491-53.1.noarch.rpm"
RPM_HASH = "8d5f08da6246a09db800909fd6bb3341191f0d2ffcbfee62ea25f83ca9d8b8f880101895305f5fcc1f572d8199334a418da5ceeedfaea368239d9f72264bc4d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-timing-diagrams.sty \
texlive-timing-diagrams"

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
