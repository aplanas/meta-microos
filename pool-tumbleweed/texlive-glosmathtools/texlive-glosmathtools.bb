SUMMARY = "Mathematical nomenclature tools based on the glossaries package"
DESCRIPTION = "This package can be used to generate a mathematical \
nomenclature (also called 'list of symbols' or 'notation'). It \
is based on the glossaries package. Its main features are: \
symbol categories (e.g.: latin, greek) automatic but \
customizable symbol sorting easy subscript management easy \
accentuation management abbreviation support (with first use \
definition) bilingual nomenclatures (for bilingual documents) \
bilingual abbreviations The documentation is based on the \
ulthese class. The package itself depends on glossaries, \
amsmath, amsfonts, and etoolbox."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn55920"

RPM_NAME = "texlive-glosmathtools-2023.201.1.0.0svn55920-53.2.noarch.rpm"
RPM_HASH = "d6ab73381a854c3e068b1297b292940df2bb21ae108a44b86f7d09e7dede0f16590ffff7928a641bd3176ecc5a03e32342197d12371d6c65634868afd65e1318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glosmathtools.sty \
texlive-glosmathtools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-glossaries.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
