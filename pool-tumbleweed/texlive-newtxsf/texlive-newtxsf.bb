SUMMARY = "Sans-math fonts for use with newtx"
DESCRIPTION = "The package provides a maths support that amounts to \
modifications of the STIX sans serif Roman and Greek letters \
with most symbols taken from newtxmath (which must of course be \
installed and its map file enabled)."
LICENSE = "OFL-1.1"

PV = "2023.209.1.054svn59227"

RPM_NAME = "texlive-newtxsf-2023.209.1.054svn59227-55.1.noarch.rpm"
RPM_HASH = "da0c226da141b8c5d8437db1ca343304ed3a06bd596995491c90c8d9c37c820bbfb06d1bc4b6492c5cacc11c67c9649e1f048839206dbdfeddfe7c30e785d983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newtxsf.map \
tex-newtxsf.sty \
tex-ntxsfbmi.tfm \
tex-ntxsfbmi.vf \
tex-ntxsfbmia.tfm \
tex-ntxsfbmia.vf \
tex-ntxsfmi.tfm \
tex-ntxsfmi.vf \
tex-ntxsfmia.tfm \
tex-ntxsfmia.vf \
tex-omlntxsfmi.fd \
tex-untxsfmia.fd \
tex-zsfmi-bol.tfm \
tex-zsfmi-reg.tfm \
tex-zsfmia-bol.tfm \
tex-zsfmia-reg.tfm \
texlive-newtxsf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-rtxbmi.tfm \
tex-rtxmi.tfm \
tex-txbmia.tfm \
tex-txbsyb.tfm \
tex-txbsyc.tfm \
tex-txmia.tfm \
tex-txsyb.tfm \
tex-txsyc.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-newtxsf-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
