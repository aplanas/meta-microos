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

PV = "2023.209.1.3.1svn19083"

RPM_NAME = "texlive-texlogos-2023.209.1.3.1svn19083-55.1.noarch.rpm"
RPM_HASH = "970e648869980ca657657aade4bdcef6038f6afdcd63854960b10d0407db1bf406ae9c9c0ebe851f41537bda678ccf73e6acc4f8c4ab8c91f459c8c283c9d158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texlogos.sty \
texlive-texlogos"

RDEPENDS:${PN} += "/usr/bin/sh \
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
