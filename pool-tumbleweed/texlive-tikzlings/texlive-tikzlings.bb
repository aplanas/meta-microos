SUMMARY = "A collection of cute little animals and similar creatures"
DESCRIPTION = "A collection of LaTeX packages for drawing cute little animals \
and similar creatures using TikZ. Currently, the following \
TikZlings are included: anteater bat bear bee bug cat chicken \
coati elephant hippo koala marmot mole mouse owl panda penguin \
pig rhino sheep sloth snowman squirrel wolf These little \
drawings can be customized in many ways."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn63628"

RPM_NAME = "texlive-tikzlings-2023.209.1.0svn63628-53.1.noarch.rpm"
RPM_HASH = "52df3135d96f8694ab5d89524510c26d110a63fca7802e478381c54fb2c32703aa902378704e053c6f9b78ec9e6fdeabe77c71ec049cec4dd1bbf172c5082a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarytikzlings.code.tex \
tex-tikzlings-addons.sty \
tex-tikzlings-anteaters.sty \
tex-tikzlings-bats.sty \
tex-tikzlings-bears.sty \
tex-tikzlings-bees.sty \
tex-tikzlings-bugs.sty \
tex-tikzlings-cats.sty \
tex-tikzlings-chickens.sty \
tex-tikzlings-coatis.sty \
tex-tikzlings-elephants.sty \
tex-tikzlings-hippos.sty \
tex-tikzlings-koalas.sty \
tex-tikzlings-list.sty \
tex-tikzlings-marmots.sty \
tex-tikzlings-mice.sty \
tex-tikzlings-moles.sty \
tex-tikzlings-owls.sty \
tex-tikzlings-pandas.sty \
tex-tikzlings-penguins.sty \
tex-tikzlings-pigs.sty \
tex-tikzlings-rhinos.sty \
tex-tikzlings-sheep.sty \
tex-tikzlings-sloths.sty \
tex-tikzlings-snowmen.sty \
tex-tikzlings-squirrels.sty \
tex-tikzlings-wolves.sty \
tex-tikzlings.sty \
texlive-tikzlings"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
