SUMMARY = "Unofficial beamer theme for the University of Hohenheim"
DESCRIPTION = "The package provides a beamer theme which features the Ci \
colors of the University of Hohenheim. Please note that this is \
not an official Theme, and that there will be no support for \
it, from the University. Furthermore there is NO relationship \
between the University and this theme."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn27036"

RPM_NAME = "texlive-hobete-2023.201.svn27036-53.2.noarch.rpm"
RPM_HASH = "a052a0b2fd8cf2b3f4d15f608ab39f6b25d7c6ddce0277d2b024a92b9b9b9655379ca8604bf93fb86ab3e4e2a7949cb05d228ae6b70f9ff8715f72da5c4e181f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemehohenheim.sty \
tex-beamerouterthemehohenheim.sty \
tex-beamerouterthemehohenheimposter.sty \
tex-beamerthemehohenheim.sty \
tex-hobete.sty \
texlive-hobete"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xfrac.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
