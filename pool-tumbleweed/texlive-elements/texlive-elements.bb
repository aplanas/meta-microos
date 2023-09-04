SUMMARY = "Provides properties of chemical elements"
DESCRIPTION = "The package provides means for retrieving properties of \
chemical elements like atomic number, element symbol, element \
name, electron distribution or isotope number. Properties are \
defined for the elements up to the atomic number 112. This \
package is a spin-off of the package bohr by the same author."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn61792"

RPM_NAME = "texlive-elements-2023.209.0.0.4svn61792-54.2.noarch.rpm"
RPM_HASH = "19d5d9014d3c416cf0f6a432aa51fb443f0791fb39bdf3421dbc70d976261b513be554ab5ce547784215f823375bceb03de67a4ec34964b7080bd78503759959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elements-names-brazil.def \
tex-elements-names-english.def \
tex-elements-names-french.def \
tex-elements-names-german.def \
tex-elements-names-portuges.def \
tex-elements-names-spanish.def \
tex-elements.sty \
texlive-elements"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-translations.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
