SUMMARY = "Draw pseudo-3D diagrams of Bloch spheres"
DESCRIPTION = "This package is used to draw pseudo-3D Blochsphere diagrams. It \
supports various annotations, such as great and small circles, \
axes, rotation markings and state vectors. It can be used in a \
standalone fashion, or nested within a tikzpicture environment \
by setting the environment option nested to true."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn38388"

RPM_NAME = "texlive-blochsphere-2023.209.1.1svn38388-53.1.noarch.rpm"
RPM_HASH = "f996145c085f55d840eff4091db1266fba96c118e1681834b84b8b28c2eeec3ff797617b1dc4dd7e2df1ce35f48839b0c07c4f5bade891510e2c4b7635c03bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blochsphere.sty \
texlive-blochsphere"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
