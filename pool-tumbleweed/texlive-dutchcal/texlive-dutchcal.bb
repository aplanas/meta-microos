SUMMARY = "A reworking of ESSTIX13, adding a bold version"
DESCRIPTION = "This package reworks the mathematical calligraphic font \
ESSTIX13, adding a bold version. LaTeX support files are \
included. The new fonts may also be accessed from the most \
recent version of mathalpha. The fonts themselves are subject \
to the SIL OPEN FONT LICENSE, version 1.1."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-dutchcal-2023.209.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "04d5dc9c01c2695678747c96b917929d8922d3977d54601dbdf210f37213ab302d90a12a8da1f99c3af6a5a476c717b8f947a3df423be6b18ee1889f255820ec"
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

RDEPENDS:${PN} += "/usr/bin/sh \
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
