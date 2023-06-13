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

RPM_NAME = "texlive-pst-shell-2023.201.0.0.03svn56070-53.1.noarch.rpm"
RPM_HASH = "869fe8158e80d5428745efe9f986cdb5e08ccb825d1bc24d59c3eba5a29498e6a7527f3edfc505e3cf34d2e04c65bcafae11c44cb91cbd291974e4693ac6af18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-shell.sty) \
tex(pst-shell.tex) \
texlive-pst-shell"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
