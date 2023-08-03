SUMMARY = "Create outlines for scientific documents"
DESCRIPTION = "Every scientifc document requires outlining before it is \
written. This package adds simple macros for your LaTeX \
document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn45601"

RPM_NAME = "texlive-outlining-2023.209.0.0.1svn45601-55.1.noarch.rpm"
RPM_HASH = "9f380eb22aac9ee53eccb1b68511de13e42591a0790007487e5821651b3e701face414e822cc1579d7d2cf046481d569420772ec80f1af27ca1d66ec23d24577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-outlining.sty \
texlive-outlining"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-todonotes.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
