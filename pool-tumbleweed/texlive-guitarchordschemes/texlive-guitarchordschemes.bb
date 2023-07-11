SUMMARY = "Guitar Chord and Scale Tablatures"
DESCRIPTION = "This package provides two commands (\\chordscheme and \\scales). \
With those commands it is possible to draw schematic diagrams \
of guitar chord tablatures and scale tablatures. Both commands \
know a range of options that allow wide customization of the \
output. The package's drawing is done with the help of TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn54512"

RPM_NAME = "texlive-guitarchordschemes-2023.201.0.0.7svn54512-53.2.noarch.rpm"
RPM_HASH = "c2c458677583fc5ee8ee7533bbb4dbaebf580345b40196c07172c93740442fa6b92b7f4f45208fd5cd25480ec9827c28b30a0497fed617177da8ac3e470c3e68"
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
