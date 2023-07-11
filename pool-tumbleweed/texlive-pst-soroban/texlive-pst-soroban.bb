SUMMARY = "Draw a Soroban using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw a Japanese abacus, or \
soroban. The soroban is still used in Japan today."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-pst-soroban-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "1379678e37bc7b1cee80a5650521ecb6c74c0ee10728b1148727dc2c9ee20067c8c1277bbc3d23e371f9d164c2b91b9647831068a30f943b4319ce4ad26b7574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-soroban.sty \
texlive-pst-soroban"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pstricks-add.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
