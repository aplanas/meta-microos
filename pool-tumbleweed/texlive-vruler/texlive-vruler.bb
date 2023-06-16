SUMMARY = "Numbering text"
DESCRIPTION = "The package offers facilities for adding a columns of numbering \
to the general text so that the text can be properly \
referenced. The vertical ruler can be scaled and moved freely. \
The package may be used either with LaTeX or with plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn21598"

RPM_NAME = "texlive-vruler-2023.201.2.3svn21598-53.1.noarch.rpm"
RPM_HASH = "43c53b417764c072ded53819b976a74d7e67f90dceedd811b69a13c2138d02613b38b96d33e8837220bae761206d188754feaceeec2e7612e601d65f374ae1fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vruler.sty \
texlive-vruler"

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
