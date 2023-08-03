SUMMARY = "Technical dimension lines using PGF/TikZ"
DESCRIPTION = "tikz-dimline helps drawing technical dimension lines in TikZ \
picture environments. Its usage is similar to some \
contributions posted on stackexchange."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35805"

RPM_NAME = "texlive-tikz-dimline-2023.209.1.0svn35805-53.1.noarch.rpm"
RPM_HASH = "8046193261b1772258dee303e2ab0598e8cd81be209617dbc46d66cdd520fff34906ff503c02c3d8321694139beadb825ff31f7321a3d91de6345e5ef028aee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-dimline.sty \
texlive-tikz-dimline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pgfplots.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
