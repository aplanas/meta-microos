SUMMARY = "Draw graphs typically found in molecular biology texts"
DESCRIPTION = "The package draws graphs typically found in molecular biology \
texts. Currently, the package contains modules for drawing DNA \
sequencing chromatograms and protein domain diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21svn35152"

RPM_NAME = "texlive-pgfmolbio-2023.201.0.0.21svn35152-51.1.noarch.rpm"
RPM_HASH = "99232aabf46691bebab1a4a2af86a0ed1c2cbf3257c7e80162d1c7d31238e314ffa7e448ed539d82c24967d0c1a10714da659854b1063fcc9b57b9024fa962f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfmolbio.chromatogram.tex \
tex-pgfmolbio.convert.tex \
tex-pgfmolbio.domains.tex \
tex-pgfmolbio.sty \
texlive-pgfmolbio"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase-modutils.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
