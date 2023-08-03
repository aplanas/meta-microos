SUMMARY = "Hanging paragraphs"
DESCRIPTION = "The hanging package facilitates the typesetting of hanging \
paragraphs. The package also enables typesetting with hanging \
punctuation, by making punctuation characters active. This \
facility is best suppressed (it can interfere with other \
packages) -- there are package options for suppressing each \
individual punctuation character. 'Real' attempts at hanging \
punction should nowadays use the microtype package, which takes \
advantage of the support offered in recent versions of pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn15878"

RPM_NAME = "texlive-hanging-2023.209.1.2bsvn15878-54.1.noarch.rpm"
RPM_HASH = "d3bb1ec52fe008720560e1a08508e625f9b9ea952cc67603505577f1a984dc43e6e11e3da359f715a75449111e4e803e24f358d5bc2b4ab0b43ddc421c6b180c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hanging.sty \
texlive-hanging"

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
