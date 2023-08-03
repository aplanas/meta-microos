SUMMARY = "Guitar Chord and Scale Tablatures"
DESCRIPTION = "This package provides two commands (\\chordscheme and \\scales). \
With those commands it is possible to draw schematic diagrams \
of guitar chord tablatures and scale tablatures. Both commands \
know a range of options that allow wide customization of the \
output. The package's drawing is done with the help of TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn54512"

RPM_NAME = "texlive-guitarchordschemes-2023.209.0.0.7svn54512-54.1.noarch.rpm"
RPM_HASH = "83ac4289bf579517444d2a11c9b51e580674e8415d7f8f620d063b32d9b251bbb1b21d2ef9d0338be5e3c05d9289ae82d0df85bd8a4114e46ef1e53c379d3e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-guitarchordschemes.sty \
texlive-guitarchordschemes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cnltx-base.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
