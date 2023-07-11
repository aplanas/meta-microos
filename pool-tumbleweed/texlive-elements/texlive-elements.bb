SUMMARY = "Provides properties of chemical elements"
DESCRIPTION = "The package provides means for retrieving properties of \
chemical elements like atomic number, element symbol, element \
name, electron distribution or isotope number. Properties are \
defined for the elements up to the atomic number 112. This \
package is a spin-off of the package bohr by the same author."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn61792"

RPM_NAME = "texlive-elements-2023.201.0.0.4svn61792-53.2.noarch.rpm"
RPM_HASH = "f9843755f58438538b9c76fbbcbc2c750c36308831fd77939dccecad0bc375bed65b6c9d1655b227dcbf285f3a1fb3a372f829ec072fc5557ee4ac910f4b2b5f"
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
