SUMMARY = "Provides properties of chemical elements"
DESCRIPTION = "The package provides means for retrieving properties of \
chemical elements like atomic number, element symbol, element \
name, electron distribution or isotope number. Properties are \
defined for the elements up to the atomic number 112. This \
package is a spin-off of the package bohr by the same author."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn61792"

RPM_NAME = "texlive-elements-2023.201.0.0.4svn61792-53.1.noarch.rpm"
RPM_HASH = "a6a331f9aa9fa19cc07809bb614395525c675cf35106d45ca8e38870da9b1ab87000b119563e5ecdce3165e5d41745571ddf2765896790db19533b30bf63c18e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(elements.sty) \
tex(elements_names_brazil.def) \
tex(elements_names_english.def) \
tex(elements_names_french.def) \
tex(elements_names_german.def) \
tex(elements_names_portuges.def) \
tex(elements_names_spanish.def) \
texlive-elements"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(translations.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
