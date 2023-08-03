SUMMARY = "Draw ellipses and elliptical arcs using the standard LaTeX2e picture environment"
DESCRIPTION = "Draw ellipses and elliptical arcs using the standard LaTeX2e \
picture environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39025"

RPM_NAME = "texlive-ellipse-2023.209.1.0svn39025-54.1.noarch.rpm"
RPM_HASH = "d2ffd25a25046a6f50a0dd12087edb6d673e5cba0254b08423fa1af3e746718a2c50ee1a47ec2cbc036f8bc5302524654a5a7f92f47d74a69e45068f2971e567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ellipse.sty \
texlive-ellipse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
