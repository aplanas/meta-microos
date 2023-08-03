SUMMARY = "A symbol for the shuffle product"
DESCRIPTION = "The bundle provides a LaTeX package and a font (as Metafont \
source) for the shuffle product which is used in some part of \
mathematics and physics."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-shuffle-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "de641f2d474199c0c44827fc1eeba4481ee3cce426de51b1c20aa2571f3582745a46db6b19fc81b3299081be52bf7ffc993fa02b6537c653bb6496fc9cd54ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ushuffle.fd \
tex-shuffle.sty \
tex-shuffle10.tfm \
tex-shuffle7.tfm \
texlive-shuffle"

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
