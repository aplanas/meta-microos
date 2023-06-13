SUMMARY = "Typeset method and variable declarations"
DESCRIPTION = "The package supports typesetting of programming language method \
and variable declarations. It supports declarations in German, \
French and English."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn17485"

RPM_NAME = "texlive-method-2023.201.2.0bsvn17485-54.1.noarch.rpm"
RPM_HASH = "86ff524b12fcfb484b6c43d94c994c103d756cd6b60528ffb0ea1ca843cdf939491cc5fee102b0b622f69d9c73673134614867f8a06d567bb7e5a957225a7c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(method.sty) \
texlive-method"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
