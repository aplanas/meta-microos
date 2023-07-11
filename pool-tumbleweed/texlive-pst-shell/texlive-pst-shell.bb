SUMMARY = "Plotting sea shells"
DESCRIPTION = "pst-shell is a PSTricks related package to draw seashells in 3D \
view: Argonauta, Epiteonium, Lyria, Turritella, Tonna, \
Achatina, Oxystele, Conus, Ammonite, Codakia, Escalaria, \
Helcion, Natalina, Planorbis, and Nautilus, all with different \
parameters. pst-shell needs pst-solides3d and an up-to-date \
PSTricks, which should be part of your local TeX installation, \
otherwise get it from a CTAN server."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn56070"

RPM_NAME = "texlive-pst-shell-2023.201.0.0.03svn56070-53.2.noarch.rpm"
RPM_HASH = "a348d736768fec46e438b6514b8219eae9491dcd85a38e7c5bda608628be70814f5bd6cc84c9b3bb323ce7db3fe90f70c75564947cad8a86dd7a82692f667514"
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
