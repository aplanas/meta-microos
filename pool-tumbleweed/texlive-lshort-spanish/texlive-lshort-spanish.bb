SUMMARY = "Short introduction to LaTeX, Spanish translation"
DESCRIPTION = "A Spanish translation of the Short Introduction to LaTeX2e, \
version 20."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.5svn35050"

RPM_NAME = "texlive-lshort-spanish-2023.208.0.0.5svn35050-53.1.noarch.rpm"
RPM_HASH = "32685a3a3eb711a69d47c55281894ae945226b70866629aa01da1b30f52dad06726ffcf22adc1809cc7f33be9a338c0cc82168c0e9af04cdbedcc671b22f79e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-spanish"

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
