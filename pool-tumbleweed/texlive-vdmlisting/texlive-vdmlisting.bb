SUMMARY = "Typesetting VDM in ASCII syntax"
DESCRIPTION = "The package is an extension for the listings package that \
provides a source code printer for LaTeX. This package defines \
new language definitions and listing environments for the three \
language dialects of the Vienna Development Method: VDM-SL, \
VDM-PP and VDM-RT. If one wants to typeset VDM with a \
mathematical syntax instead of the ASCII syntax used here one \
should use the vdm package instead"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56905"

RPM_NAME = "texlive-vdmlisting-2023.201.1.1svn56905-53.1.noarch.rpm"
RPM_HASH = "524544e7fdb59edbbd7d59dd78e5235b8c2b36371cbc2383e8bdfba5b92695f2ddc273b69e24c6134b60900ec95173ed559aef5ffac6d8a7e0bc564e8cd5927f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vdmlisting.sty \
texlive-vdmlisting"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-listings.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
