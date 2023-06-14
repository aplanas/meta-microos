SUMMARY = "A symbol for the shuffle product"
DESCRIPTION = "The bundle provides a LaTeX package and a font (as Metafont \
source) for the shuffle product which is used in some part of \
mathematics and physics."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-shuffle-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "8c7ca9b0e56092c32730704d0215694e9a3a77de9f43d1d4bc1bee25e3e13a57806bb49fb8ab694f066387235e3cbd220cb87f20f436f362ea7a1903c330a757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ushuffle.fd \
tex-shuffle.sty \
tex-shuffle10.tfm \
tex-shuffle7.tfm \
texlive-shuffle"

RDEPENDS:${PN} += "/bin/sh \
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
