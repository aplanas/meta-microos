SUMMARY = "Modification of a Go package to create othello boards"
DESCRIPTION = "A package (based on Kolodziejska's go), and fonts (as Metafont \
source) are provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-othello-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "800fd8c5a884c5ffa4d9817d972114a1b51310b1186619d56623425bdf2acbff8c33bfb3ff9b122974f6b23091e31d54686d3cff20e0ca92d6b4ff5dae323ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot10.tfm \
tex-ot15.tfm \
tex-ot1bla10.tfm \
tex-ot1bla15.tfm \
tex-ot1bla20.tfm \
tex-ot1neu10.tfm \
tex-ot1neu15.tfm \
tex-ot1neu20.tfm \
tex-ot1whi10.tfm \
tex-ot1whi15.tfm \
tex-ot1whi20.tfm \
tex-othello.sty \
texlive-othello"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
