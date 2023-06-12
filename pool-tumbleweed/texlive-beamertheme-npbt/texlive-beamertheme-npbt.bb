SUMMARY = "A collection of LaTeX beamer themes"
DESCRIPTION = "'NPBT' stands for 'Norman's Pandoc Beamer Themes'. Currently \
the following themes are supported: Sefiroth Consulting: A \
private (demonstration) theme. FOM: The layout of Hochschule \
FOM. FOM ifes: The layout of Hochschule FOM, Institut fur \
Empirie & Statistik. eufom: The layout of eufom."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.1svn54512"

RPM_NAME = "texlive-beamertheme-npbt-2023.201.4.1svn54512-53.1.noarch.rpm"
RPM_HASH = "38cd7f008f5c7393de9f3456e3c61cec26689ddde9e123b7c0ecd59673b2760e0dc40d0948b4f0d75d55ab01c49322e28c6642c7f52a905500ff88494b230470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemeNPBT_EUFOM.sty) \
tex(beamercolorthemeNPBT_FOM.sty) \
tex(beamercolorthemeNPBT_FOM_ifes.sty) \
tex(beamercolorthemeNPBT_SC.sty) \
tex(beamerouterthemeNPBT_FOM.sty) \
tex(beamerouterthemeNPBT_FOM_ifes.sty) \
tex(beamerthemeNPBT.sty) \
texlive-beamertheme-npbt"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(eurosym.sty) \
tex(fontenc.sty) \
tex(ifthen.sty) \
tex(lmodern.sty) \
tex(multicol.sty) \
tex(pgfplots.sty) \
tex(ragged2e.sty) \
tex(textcomp.sty) \
tex(tikz.sty) \
tex(xltxtra.sty) \
tex(xspace.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
