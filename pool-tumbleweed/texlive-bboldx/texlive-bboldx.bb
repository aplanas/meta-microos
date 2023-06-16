SUMMARY = "Extension of the bbold package with a Blackboard Bold alphabet"
DESCRIPTION = "Extension of bbold to a package with three weights, of which \
the original is considered as light and the additions as \
regular and bold."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.032svn65424"

RPM_NAME = "texlive-bboldx-2023.201.1.032svn65424-53.1.noarch.rpm"
RPM_HASH = "4c49f1e38304b081fe21476c0c001e88d7815b289f15aea35c9483bf6159e0951e32dba748f698b0fba30f855b9ef8e5d8793a6629e0e27c05a0757390fd5f1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-BBOLDX-Bold.tfm \
tex-BBOLDX-Regular.tfm \
tex-BBOLDX-Thin.tfm \
tex-Ubboldx.fd \
tex-bboldx.enc \
tex-bboldx.map \
tex-bboldx.sty \
texlive-bboldx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-bboldx-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
