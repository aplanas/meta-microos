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

PV = "2023.209.1.0.0svn55920"

RPM_NAME = "texlive-glosmathtools-2023.209.1.0.0svn55920-54.2.noarch.rpm"
RPM_HASH = "22da3bc72e95541649fbdff1948ca22b421220d44ac1d281e3cd840a257c5f6e740fd19611e3b797ccbb67f7a08927e790e1751e61306fa3617d34eb9c5922ed"
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
