SUMMARY = "Horizontally and vertically split elliptical nodes"
DESCRIPTION = "This package provides horizontally and vertically split \
elliptical (pairs of) nodes in TikZ. The package name derives \
from the fact that split ellipses of this type are used to \
represent Single-World Intervention Graph (SWIG) models which \
are used in counterfactual causal inference."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59889"

RPM_NAME = "texlive-tikz-swigs-2023.209.svn59889-53.1.noarch.rpm"
RPM_HASH = "4d539fe7247e71a27568aa54f17f557ea50fe2673de411a80165aec91266962a6ae40289b9424d92debba1663aa60d710cc630a775e07465fc5cb48c0fe0b892"
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
