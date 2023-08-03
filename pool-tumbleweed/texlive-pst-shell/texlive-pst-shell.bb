SUMMARY = "Plotting sea shells"
DESCRIPTION = "pst-shell is a PSTricks related package to draw seashells in 3D \
view: Argonauta, Epiteonium, Lyria, Turritella, Tonna, \
Achatina, Oxystele, Conus, Ammonite, Codakia, Escalaria, \
Helcion, Natalina, Planorbis, and Nautilus, all with different \
parameters. pst-shell needs pst-solides3d and an up-to-date \
PSTricks, which should be part of your local TeX installation, \
otherwise get it from a CTAN server."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn56070"

RPM_NAME = "texlive-pst-shell-2023.209.0.0.03svn56070-54.1.noarch.rpm"
RPM_HASH = "bb9f99c836b9f0e70b303d71b52386a2354a6298a8edacc14a0111b6bff011751525b2ecf60ae207402759a3132b9b1a620c7eccd238af749c9a8c2452b2817a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-shell.sty \
tex-pst-shell.tex \
texlive-pst-shell"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
