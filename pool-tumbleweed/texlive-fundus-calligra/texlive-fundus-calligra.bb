SUMMARY = "Support for the calligra font in LaTeX documents"
DESCRIPTION = "The package offers support for the calligra handwriting font, \
in LaTeX documents. The package is part of the fundus bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn26018"

RPM_NAME = "texlive-fundus-calligra-2023.209.1.2svn26018-53.1.noarch.rpm"
RPM_HASH = "66a72c4c451f3489f1e334b1ead74fc3e3485534d1a70ae3d665e61ab621c453b0b4003936f030e3eb7cfbd6e5d3483a61bfb82f7d0edce3815cc3cd7aaf8657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calligra.sty \
texlive-fundus-calligra"

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
