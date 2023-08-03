SUMMARY = "Creating and managing exercises, and reusing them as composed sets"
DESCRIPTION = "This package makes it easier to maintain and edit your exercise \
sets. Exercises are saved as separate files containing part \
problems. These files can be used to make sets, and you can \
cherry-pick or exclude certain part problems as you see fit."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn50448"

RPM_NAME = "texlive-exercisebank-2023.209.0.0.3.0svn50448-53.1.noarch.rpm"
RPM_HASH = "7b1bf6992ce7edbf7bdc1503e8a0f82f07d74cffde596e6f4eeb2a2062e660fbfc0a0c65a54b580140b0837acbba9094043f0079212fe4affd174e3d5c156b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exercisebank.sty \
texlive-exercisebank"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-comment.sty \
tex-geometry.sty \
tex-listofitems.sty \
tex-needspace.sty \
tex-pgffor.sty \
tex-pgfpages.sty \
tex-scrextend.sty \
tex-trimspaces.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
