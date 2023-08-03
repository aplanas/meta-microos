SUMMARY = "A double-struck serifed font for mathematical use"
DESCRIPTION = "DSSerif is a mathematical font package with double struck \
serifed digits, upper and lower case letters, in regular and \
bold weights. The design was inspired by the STIX double struck \
fonts, which are sans serif, but starting from a Courier-like \
base."
LICENSE = "OFL-1.1"

PV = "2023.209.1.031svn60898"

RPM_NAME = "texlive-dsserif-2023.209.1.031svn60898-53.1.noarch.rpm"
RPM_HASH = "d92cfc360d498d9732aa5587c76d88fa1ea14bcdbb874d504eca7a2abbdf5004cb2c413e8b5f2ab6363e769396c1cd1ac37cc62b613a55b36eeccd94b5aafd4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DSSerif-Bold.tfm \
tex-DSSerif.map \
tex-DSSerif.tfm \
tex-DSSerifUni-Bold.tfm \
tex-DSSerifUni.tfm \
tex-dsserif.sty \
tex-udsserif.fd \
texlive-dsserif"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-dsserif-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
