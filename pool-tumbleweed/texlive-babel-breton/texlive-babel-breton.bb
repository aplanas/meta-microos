SUMMARY = "Babel contributed support for Breton"
DESCRIPTION = "Breton (being, principally, a spoken language) does not have \
typographic rules of its own; this package provides an \
'appropriate' selection of French and British typographic \
rules."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn30257"

RPM_NAME = "texlive-babel-breton-2023.201.1.0hsvn30257-53.1.noarch.rpm"
RPM_HASH = "10fbb34a634ba0584108121bb2b19960ec84c63da1a3eb47d03f8da2142ac91d9741ff27f9dfb53c57743b2943dfa3d1011ecd46aba1fc677021dae4a1347561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-breton.ldf \
texlive-babel-breton"

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
