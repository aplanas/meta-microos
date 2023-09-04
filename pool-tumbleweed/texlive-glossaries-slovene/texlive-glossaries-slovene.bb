SUMMARY = "Slovene language module for glossaries package"
DESCRIPTION = "Slovene language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51211"

RPM_NAME = "texlive-glossaries-slovene-2023.209.1.0svn51211-54.2.noarch.rpm"
RPM_HASH = "5e034140f5a36f372861281980e8e139003cbdd2e545625e19384fca1e84b907e43126dcfd2ead025d2e4323a2bcdb327dd741add3eff1880bb57e49a33e137e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-slovene.ldf \
texlive-glossaries-slovene"

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
