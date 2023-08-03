SUMMARY = "Type 1 version of Calligra"
DESCRIPTION = "This is a conversion (using mf2pt1) of Peter Vanroose's \
handwriting font."
LICENSE = "LPPL-1.0"

PV = "2023.209.001.000svn24302"

RPM_NAME = "texlive-calligra-type1-2023.209.001.000svn24302-53.1.noarch.rpm"
RPM_HASH = "e7515125d9d94900596c2480a404a679a2790162a46632b4cf77d38fb902474e05a1d1cadf51a344d2d5dfa9df10539470f342f6e8992d3dcf2f7c4a024744c8"
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
