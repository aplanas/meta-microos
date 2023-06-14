SUMMARY = "Guitar Chord and Scale Tablatures"
DESCRIPTION = "This package provides two commands (\\chordscheme and \\scales). \
With those commands it is possible to draw schematic diagrams \
of guitar chord tablatures and scale tablatures. Both commands \
know a range of options that allow wide customization of the \
output. The package's drawing is done with the help of TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn54512"

RPM_NAME = "texlive-guitarchordschemes-2023.201.0.0.7svn54512-53.1.noarch.rpm"
RPM_HASH = "499fe2169be8ff05001b7a835929d15441b7392476424bb88781763ed6bce357bedb676f2bd603f4c636ce3f2db3803b472f474eaa6ccd994ad5351647a09c80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-guitarchordschemes.sty \
texlive-guitarchordschemes"

RDEPENDS:${PN} += "/bin/sh \
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
