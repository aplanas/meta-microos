SUMMARY = "Package xelatex-dev"
DESCRIPTION = "The xelatex-dev package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62145"

RPM_NAME = "texlive-xelatex-dev-2023.209.svn62145-53.1.noarch.rpm"
RPM_HASH = "148a7af1f9e22da1e8aafa763344e0168537a400730d0e10eebdfed7173e656743eb433b7d4960ff02e3516eb462b2e435c1bcae71acef31a105900dbe742477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xelatex-dev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-atbegshi \
texlive-atveryend \
texlive-babel \
texlive-cm \
texlive-everyshi \
texlive-filesystem \
texlive-firstaid \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-base-dev \
texlive-latex-firstaid-dev \
texlive-latex-fonts \
texlive-lm \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data \
texlive-xelatex-dev-bin \
texlive-xetex"

inherit rpm
