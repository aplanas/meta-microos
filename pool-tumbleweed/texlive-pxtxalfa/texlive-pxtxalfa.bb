SUMMARY = "Virtual maths alphabets based on pxfonts and txfonts"
DESCRIPTION = "The package provides virtual math alphabets based on pxfonts \
and txfonts, with LaTeX support files and adjusted metrics. The \
mathalpha package offers support for this collection."
LICENSE = "LPPL-1.0"

PV = "2023.209.2svn60847"

RPM_NAME = "texlive-pxtxalfa-2023.209.2svn60847-54.1.noarch.rpm"
RPM_HASH = "29cb0aa1b3476b7c262b2c7564dec7f6355f2e8457ab798f0464f0a3b2bd70157e72210f4996ce83bf579e35f86a15b697dd8d851b8cea1bce0c40c85d203f2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1tx-ds.fd \
tex-ot1tx-frak.fd \
tex-px-ds.sty \
tex-pxb-ds.tfm \
tex-pxb-ds.vf \
tex-pxr-ds.tfm \
tex-pxr-ds.vf \
tex-pxtx-cal.sty \
tex-pxtx-frak.sty \
tex-rtxmia.tfm \
tex-tx-ds.sty \
tex-tx-of.sty \
tex-txb-cal.tfm \
tex-txb-cal.vf \
tex-txb-frak.tfm \
tex-txb-frak.vf \
tex-txb-of.tfm \
tex-txb-of.vf \
tex-txr-cal.tfm \
tex-txr-cal.vf \
tex-txr-ds.tfm \
tex-txr-ds.vf \
tex-txr-frak.tfm \
tex-txr-frak.vf \
tex-txr-of.tfm \
tex-txr-of.vf \
tex-upx-ds.fd \
tex-utx-cal.fd \
tex-utx-of.fd \
texlive-pxtxalfa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmr10.tfm \
tex-pxbsyb.tfm \
tex-pxsyb.tfm \
tex-txbmiaX.tfm \
tex-txbsy.tfm \
tex-txbsyb.tfm \
tex-txmiaSTbb.tfm \
tex-txmiaX.tfm \
tex-txsy.tfm \
tex-txsyb.tfm \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
