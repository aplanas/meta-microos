SUMMARY = "Package xelatex-dev"
DESCRIPTION = "The xelatex-dev package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62145"

RPM_NAME = "texlive-xelatex-dev-2023.209.svn62145-53.2.noarch.rpm"
RPM_HASH = "505399caec7c72f8dbb95a02b58a10fdca25d6d0c508cd2c44281c851e74bb0b41b6669b73a49343bdba2b81497ba0302135d25cd4fdc58348be6c1b31218e45"
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
