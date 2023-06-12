SUMMARY = "Mathematics style for science and technology"
DESCRIPTION = "The package provides tools for a mathematical style that \
conforms to the International Standard ISO 80000-2 and is \
common in science and technology. It changes the default shape \
of capital Greek letters to italic, sets up bold italic and \
sans-serif bold italic math alphabets with Latin and Greek \
characters, and defines macros for markup of vector, matrix and \
tensor symbols."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6.1svn27654"

RPM_NAME = "texlive-isomath-2023.201.0.0.6.1svn27654-55.1.noarch.rpm"
RPM_HASH = "5e6880d1fd8647ceedef8a84bc13eb3561e6e46782e3957eded144858754f90f45ff86b58bc9e11a38764c22b11cd8eceae306eb699aa0a1f61bea99c90f346c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(isomath.sty) \
texlive-isomath"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fixmath.sty) \
tex(kvoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
