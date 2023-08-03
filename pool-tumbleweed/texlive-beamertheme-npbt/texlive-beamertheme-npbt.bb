SUMMARY = "A collection of LaTeX beamer themes"
DESCRIPTION = "'NPBT' stands for 'Norman's Pandoc Beamer Themes'. Currently \
the following themes are supported: Sefiroth Consulting: A \
private (demonstration) theme. FOM: The layout of Hochschule \
FOM. FOM ifes: The layout of Hochschule FOM, Institut fur \
Empirie & Statistik. eufom: The layout of eufom."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.1svn54512"

RPM_NAME = "texlive-beamertheme-npbt-2023.209.4.1svn54512-54.1.noarch.rpm"
RPM_HASH = "0abdd4416ccae0894d6923b9c567fe638112cfeb44caa2471718330bb6df6d7b615f162414a1e00af2255d5144f6304f6ea94096da38711425c1d2babf72dd0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeNPBT-EUFOM.sty \
tex-beamercolorthemeNPBT-FOM-ifes.sty \
tex-beamercolorthemeNPBT-FOM.sty \
tex-beamercolorthemeNPBT-SC.sty \
tex-beamerouterthemeNPBT-FOM-ifes.sty \
tex-beamerouterthemeNPBT-FOM.sty \
tex-beamerthemeNPBT.sty \
texlive-beamertheme-npbt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-eurosym.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-lmodern.sty \
tex-multicol.sty \
tex-pgfplots.sty \
tex-ragged2e.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xltxtra.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
