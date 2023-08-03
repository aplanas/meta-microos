SUMMARY = "Print a calendar for a group of years"
DESCRIPTION = "The package prints a calendar for two or more years, according \
to a language selection. The package is also 'culture \
dependent' in the sense that it will start weeks according to \
local rules: e.g., weeks conventionally start on Monday in the \
English-speaking world. The package requires array, babel, and \
geometry."
LICENSE = "LPPL-1.0"

PV = "2023.209.20.23asvn65426"

RPM_NAME = "texlive-calxxxx-yyyy-2023.209.20.23asvn65426-53.1.noarch.rpm"
RPM_HASH = "f8d29d662c02ae533ed08568c0cae997b577886c843cd3c9dbd1b10c29fc0b71488ae50911dffb19d406feeb183e07ab1686e53308b5c4c6adc85b50f5e5d02d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calxxxx-yyyy-doc.tex \
tex-calxxxx-yyyy.tex \
texlive-calxxxx-yyyy"

RDEPENDS:${PN} += "/usr/bin/sh \
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
