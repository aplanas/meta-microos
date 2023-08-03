SUMMARY = "Draw a Soroban using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw a Japanese abacus, or \
soroban. The soroban is still used in Japan today."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-pst-soroban-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "ef37b3744a37a87860f9d13b797b6b3380c726e5c320d0affb9ce8432fdd652c95b12d1bc3036c1fb3b682d7e8229902df0fe05514baaefcb723bb8718d73292"
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
