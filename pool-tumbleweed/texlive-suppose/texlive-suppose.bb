SUMMARY = "Abbreviate the word 'Suppose'"
DESCRIPTION = "This package provides commands for abbreviating the word \
'Suppose' in six fonts and with other variations. The author \
recommends only using these commands when the immediately \
succeeding strings are mathematical in nature. He does not \
recommend using them in formal work. The package requires \
amsmath, amsfonts, and graphicx."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.2svn59281"

RPM_NAME = "texlive-suppose-2023.201.1.2.2svn59281-57.1.noarch.rpm"
RPM_HASH = "da0ffe85c867e1afe05cdb894508fdbfb821b0cc856007e3a54c3ec305565c1d30c7ea7af2464ad742006c4bda35ecbd53c2d9ea67017a2658da16c68cfd52a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(suppose.sty) \
texlive-suppose"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(euscript.sty) \
tex(graphicx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
