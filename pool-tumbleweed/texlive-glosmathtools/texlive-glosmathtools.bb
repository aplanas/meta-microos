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

RPM_NAME = "texlive-glosmathtools-2023.201.1.0.0svn55920-53.1.noarch.rpm"
RPM_HASH = "c3c73fd02b2e04b4a6e04b6aedaadd43c4f22d583737117e020b91334f456dd1578da43e601d95e1f247e1c157fbf8a5c13db73314a1aff844a613dcb0921b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glosmathtools.sty) \
texlive-glosmathtools"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(etoolbox.sty) \
tex(glossaries.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
