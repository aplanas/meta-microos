SUMMARY = "Typeset linear phonological rules"
DESCRIPTION = "The package provides macros for typesetting phonological rules \
like those in 'Sound Pattern of English' (Chomsky and Halle \
1968)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.2svn43963"

RPM_NAME = "texlive-phonrule-2023.209.1.3.2svn43963-52.1.noarch.rpm"
RPM_HASH = "caf639e35e0dd69d7a38ff151c324ad9c32a252488194aa39904a085d9dc82ee5e957d2d01766df3dff03be8a116d1424dcc18c9fd3b61daf65d6e50a50900b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phonrule.sty \
texlive-phonrule"

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
