SUMMARY = "Ready-to-use LaTeX logos"
DESCRIPTION = "TeXlogos defines an assortment of frequently used logos not \
contained in base LaTeX itself. The Metafont, MetapostAMS, \
BibTeX and SliTeX logos are defined, as long as you have the \
appropriate CM/Logo/AMS fonts. Currency symbols Euro, Cent, \
Yen, Won and Naira are defined so as not to need TS1-encoded \
fonts. Also defined are the C++ logo, with the '+' signs \
properly positioned, and the logo of the Vienna University \
Business Administration Center (BWZ)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1svn19083"

RPM_NAME = "texlive-texlogos-2023.201.1.3.1svn19083-54.1.noarch.rpm"
RPM_HASH = "1b016c9cc33426158f3ef9a6ddfc0d39397e6fb08b3d19bd5aa9f349bc897db501191ba1428e2d84cd729227986ebfeb827f8739a5aeaccefac11d21cb091323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texlogos.sty \
texlive-texlogos"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-graphics.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
