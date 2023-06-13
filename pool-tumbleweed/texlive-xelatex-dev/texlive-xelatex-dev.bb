SUMMARY = "Package xelatex-dev"
DESCRIPTION = "The xelatex-dev package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62145"

RPM_NAME = "texlive-xelatex-dev-2023.201.svn62145-52.1.noarch.rpm"
RPM_HASH = "0f5c236a5b139998cb057daee11a23f41c1e731855a52c1bf0495bc18bb3048f950aa4d31f0bb0333e9d3b8a2759bcc7a4571f9a2d480192b222985ad3e82538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xelatex-dev"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
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
