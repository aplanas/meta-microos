SUMMARY = "Graphical representation of keys on a standard scientific calculator"
DESCRIPTION = "This package provides commands to draw scientific calculator \
keys with the help of TikZ. It also provides commands to draw \
the content of screens and of menu items."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36306"

RPM_NAME = "texlive-ticollege-2023.209.1.0svn36306-55.1.noarch.rpm"
RPM_HASH = "13118c84a74ed1d19eccfa159c18d15aced61a8b589ddd504ee5cc10c35388e9c34face25dbc2b862717e53ca1d6b6351047461836d23885853db09b94b5679f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ticollege.sty \
texlive-ticollege"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-ifthen.sty \
tex-mathtools.sty \
tex-multido.sty \
tex-multirow.sty \
tex-newtxtt.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
