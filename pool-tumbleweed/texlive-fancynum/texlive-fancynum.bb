SUMMARY = "Typeset numbers"
DESCRIPTION = "A LaTeX package for typesetting numbers, in particular floating \
point numbers, such as you find in program output."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.92svn15878"

RPM_NAME = "texlive-fancynum-2023.209.0.0.92svn15878-53.1.noarch.rpm"
RPM_HASH = "1d584ec35aab98c78831a645c0245a4bdd1da67ef3c0627a3863d2d53b5aeb8d73ed9255551b9e0ff9b4efc8acce68ebc61a31aa5b3d9141cb48d172b879e567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancynum.sty \
texlive-fancynum"

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
