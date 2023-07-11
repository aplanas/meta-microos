SUMMARY = "Virtual maths alphabets based on pxfonts and txfonts"
DESCRIPTION = "The package provides virtual math alphabets based on pxfonts \
and txfonts, with LaTeX support files and adjusted metrics. The \
mathalpha package offers support for this collection."
LICENSE = "LPPL-1.0"

PV = "2023.201.2svn60847"

RPM_NAME = "texlive-pxtxalfa-2023.201.2svn60847-53.2.noarch.rpm"
RPM_HASH = "1d9b093f3bc602a686cf8756e7cf99495cfa93866bdea2f31d191940768e173ebdbdb9987db583bfc9613383cb20e884d580449570adb99e60f4ea591d64cad8"
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
