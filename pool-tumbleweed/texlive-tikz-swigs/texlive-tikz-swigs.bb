SUMMARY = "Horizontally and vertically split elliptical nodes"
DESCRIPTION = "This package provides horizontally and vertically split \
elliptical (pairs of) nodes in TikZ. The package name derives \
from the fact that split ellipses of this type are used to \
represent Single-World Intervention Graph (SWIG) models which \
are used in counterfactual causal inference."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59889"

RPM_NAME = "texlive-tikz-swigs-2023.201.svn59889-52.1.noarch.rpm"
RPM_HASH = "a9073a73d759c36c84f298bd2306105155a149d3190bd808c19db2b0b9c6d18b78619ffeb05b81aa1172281a8fbedbc7143ccb671cb4edefd847c77e57f41d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryswigs.code.tex \
texlive-tikz-swigs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
