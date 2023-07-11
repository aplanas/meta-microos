SUMMARY = "Package xelatex-dev"
DESCRIPTION = "The xelatex-dev package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62145"

RPM_NAME = "texlive-xelatex-dev-2023.201.svn62145-52.2.noarch.rpm"
RPM_HASH = "bfe5640a07ae2acf69f6b59f3ad43c080c7bc33c6f2087180677feaf62ca7c8f9f1bfe4ccc74d8b635fdeacf92c1522bfd89295bd8c68d69bc7f68ce1e5733f1"
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
