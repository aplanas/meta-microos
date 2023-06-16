SUMMARY = "Type 1 version of Calligra"
DESCRIPTION = "This is a conversion (using mf2pt1) of Peter Vanroose's \
handwriting font."
LICENSE = "LPPL-1.0"

PV = "2023.201.001.000svn24302"

RPM_NAME = "texlive-calligra-type1-2023.201.001.000svn24302-52.1.noarch.rpm"
RPM_HASH = "c1317d3a15e17c440ddfe439c0c25baaf3503ca0dafbf6366e2316c3a022d7cfc34c3301a9adacc5193a1320658e026aa5fd5661df3ca4d4d97be05da5bc47f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calligra.map \
texlive-calligra-type1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-calligra-type1-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
