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

RPM_NAME = "texlive-glosmathtools-2023.209.1.0.0svn55920-54.1.noarch.rpm"
RPM_HASH = "b121770df36c8bf1ee43825d303e054a3e83f4f6869c0c3adb1141c6f6ea66be98623d1c862677471cb51320414a572a49d2debdb769366e61ed706542684ade"
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
