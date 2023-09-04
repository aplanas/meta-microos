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

RPM_NAME = "texlive-pst-shell-2023.209.0.0.03svn56070-54.2.noarch.rpm"
RPM_HASH = "34bb6206f8e286b5c9f2239bb271439060d560f000e17e31a6cb5a120bf8b1026a169b495d11b5cb07e8c9e67dbad8b6362f5996ff6b8cd884b5f8d1a92160d2"
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
