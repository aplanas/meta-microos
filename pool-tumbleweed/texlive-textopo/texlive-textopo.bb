SUMMARY = "Annotated membrane protein topology plots"
DESCRIPTION = "A LaTeX package for setting shaded and annotated membrane \
protein topology plots and helical wheels."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.5svn23796"

RPM_NAME = "texlive-textopo-2023.201.1.5svn23796-54.1.noarch.rpm"
RPM_HASH = "77a147ae359788168596e51fd55021be0dba5c5c1850c23e90a46e551ff3a6726e5431d07225f44c1bb949ce8769f5605a3d8e944204443e27dae20b136af367"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(biotex.sty) \
tex(textopo.def) \
tex(textopo.sty) \
texlive-textopo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(graphics.sty) \
tex(texshade.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
