SUMMARY = "A comprehensive (SI) units package"
DESCRIPTION = "Typesetting values with units requires care to ensure that the \
combined mathematical meaning of the value plus unit \
combination is clear. In particular, the SI units system lays \
down a consistent set of units with rules on how they are to be \
used. However, different countries and publishers have \
differing conventions on the exact appearance of numbers (and \
units). A number of LaTeX packages have been developed to \
provide consistent application of the various rules: SIunits, \
sistyle, unitsdef and units are the leading examples. The \
numprint package provides a large number of number-related \
functions, while dcolumn and rccol provide tools for \
typesetting tabular numbers. The siunitx package takes the best \
from the existing packages, and adds new features and a \
consistent interface. A number of new ideas have been \
incorporated, to fill gaps in the existing provision. The \
package also provides backward-compatibility with SIunits, \
sistyle, unitsdef and units. The aim is to have one package to \
handle all of the possible unit-related needs of LaTeX users. \
The package relies on LaTeX 3 support from the l3kernel and \
l3packages bundles."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.2svn66365"

RPM_NAME = "texlive-siunitx-2023.201.3.2.2svn66365-57.1.noarch.rpm"
RPM_HASH = "383ae89af58afcf44f144674878dc8b266f22d50048376e2838629ad890b9b2bf3def3efb416df9949546e29b68a11b5f0b84532e5d467be0d59701ebe573c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-siunitx-abbreviations.cfg \
tex-siunitx-binary.cfg \
tex-siunitx-v2.sty \
tex-siunitx-version-1.cfg \
tex-siunitx.sty \
texlive-siunitx"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-array.sty \
tex-color.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-textcomp.sty \
tex-translations.sty \
tex-translator.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-l3packages \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
