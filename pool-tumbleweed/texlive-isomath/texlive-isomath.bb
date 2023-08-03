SUMMARY = "Mathematics style for science and technology"
DESCRIPTION = "The package provides tools for a mathematical style that \
conforms to the International Standard ISO 80000-2 and is \
common in science and technology. It changes the default shape \
of capital Greek letters to italic, sets up bold italic and \
sans-serif bold italic math alphabets with Latin and Greek \
characters, and defines macros for markup of vector, matrix and \
tensor symbols."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6.1svn27654"

RPM_NAME = "texlive-isomath-2023.209.0.0.6.1svn27654-56.1.noarch.rpm"
RPM_HASH = "a953b461c67f8f2d65e5ce9b23d60a06f0a6a16e181e574c640401cbde8b9f2387018c9f3a443293c0540bfaae5e6b343c987d1db18bae5ea5ce9e2ec274e270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isomath.sty \
texlive-isomath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fixmath.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
