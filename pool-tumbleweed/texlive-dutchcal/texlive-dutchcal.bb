SUMMARY = "A reworking of ESSTIX13, adding a bold version"
DESCRIPTION = "This package reworks the mathematical calligraphic font \
ESSTIX13, adding a bold version. LaTeX support files are \
included. The new fonts may also be accessed from the most \
recent version of mathalpha. The fonts themselves are subject \
to the SIL OPEN FONT LICENSE, version 1.1."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-dutchcal-2023.201.1.0svn54080-52.1.noarch.rpm"
RPM_HASH = "74bcf30155476e43b373b55ecde431ac061e25abb027b2aedc14024c5ae35bdb84c7b78c1f2cd0ed985f8a9f2ae278b846b6634abb7bdd7800c6ede408b68c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dutchcal-b.tfm \
tex-dutchcal-b.vf \
tex-dutchcal-r.tfm \
tex-dutchcal-r.vf \
tex-dutchcal.map \
tex-dutchcal.sty \
tex-rdutchcalb.tfm \
tex-rdutchcalr.tfm \
tex-udutchcal.fd \
texlive-dutchcal"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmr10.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-dutchcal-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
