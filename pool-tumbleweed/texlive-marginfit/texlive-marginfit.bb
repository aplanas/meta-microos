SUMMARY = "Improved margin notes"
DESCRIPTION = "This package fixes various bugs with the margin paragraph \
implementation of LaTeX. Those bugs include margin notes that \
are attached to the wrong side as well as those that stick out \
of the bottom of the page. This package provides a drop-in \
replacement solution."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn48281"

RPM_NAME = "texlive-marginfit-2023.208.1.1svn48281-53.1.noarch.rpm"
RPM_HASH = "059c0750dd80d5c595a0adb57fa0837f8f469ed33b3a82f27088cf2cfa55a330c4e7e8a6c8f0d1064935650905afac2f252ccee53a34bd7952afff6b1c43e961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marginfit.sty \
texlive-marginfit"

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
