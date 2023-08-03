SUMMARY = "Calculate Pascal's triangle"
DESCRIPTION = "The package calculates and prints rows of Pascal's triangle. It \
may be used: simply to print successive rows of the triangle, \
or to print the rows inside an array or tabular."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-binomexp-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "132d42d8267f5d416d6199c5e2ae13423bd923109c5d94be8ee43f386df696a21e815e620a56507275787f8b93699a0ed4feb68dae673ecd9bd2b898393b162e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-binomexp.sty \
texlive-binomexp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
