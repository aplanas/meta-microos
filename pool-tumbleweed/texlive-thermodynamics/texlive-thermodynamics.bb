SUMMARY = "Macros for multicomponent thermodynamics documents"
DESCRIPTION = "This package makes typesetting quantities found in \
thermodynamics texts relatively simple. The commands are \
flexible and intended to be relatively intuitive. It handles \
several sets of notation for total, specific, and molar \
quantities; allows changes between symbols (e.g., A vs. F for \
Helmholtz free energy); and greatly simplifies the typesetting \
of symbols and partial derivatives commonly encountered in \
mixture thermodynamics. Changes of one's notes from one \
textbook to another can be achieved relatively easily by \
changing package options. The package offers a collection of \
macros and environments which are intended to make typesetting \
thermodynamics documents faster, more convenient, and more \
reliable. Macros include symbols for extensive, molar, \
specific, and partial molar properties; exces and residual \
(departure) properties; partial derivatives; heat capacities, \
compressibilities, and expansivities; saturation, mixture, and \
pure-component properties; Henry's Law parameters and activity \
coefficients; and changes on mixing, fusion, reaction, \
sublimation, and vaporization; and sets of all moles/mole \
fractions/masses/etc. being held constant in derivatives. \
Conversion of notes between textbooks is trivial for textbooks \
supported by the package, and more general changes in notation \
are also possible through package options."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn63188"

RPM_NAME = "texlive-thermodynamics-2023.201.1.00svn63188-54.1.noarch.rpm"
RPM_HASH = "e4159490898ae847a0e144f28dbf5e1d7af390b8f28f454b1d175609e3f2e25904145cbe6a024d40a6f1cbf5e805835b36bcd79f292d17357ebc45f087901912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thermodynamics.sty \
texlive-thermodynamics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
