SUMMARY = "Guitar Chord and Scale Tablatures"
DESCRIPTION = "This package provides two commands (\\chordscheme and \\scales). \
With those commands it is possible to draw schematic diagrams \
of guitar chord tablatures and scale tablatures. Both commands \
know a range of options that allow wide customization of the \
output. The package's drawing is done with the help of TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn54512"

RPM_NAME = "texlive-guitarchordschemes-2023.209.0.0.7svn54512-54.2.noarch.rpm"
RPM_HASH = "53ee3b141cc6defc45d985084ddb91433f372164afdb641cac7934635ac3c640b4771f6cd42ff94c14b8e43c377211363e6235b94684c25ef773711e6663bb9a"
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
