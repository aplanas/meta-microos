SUMMARY = "Draw block diagrams, using TikZ"
DESCRIPTION = "The package provides a set of macros for constructing block \
diagrams, using TikZ. (The blox package is an 'English \
translation' of this package.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn58212"

RPM_NAME = "texlive-schemabloc-2023.209.1.5svn58212-54.1.noarch.rpm"
RPM_HASH = "eb7051c8ad67fd78484cc4519a0ef077e700967108634d2d9038e3dabf1cfaba8e1160e271a4eccd858b6e596956ee7ccddc3906197e61aa30eeb9e710dc867e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schemabloc.sty \
texlive-schemabloc"

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
