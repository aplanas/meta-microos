SUMMARY = "Creating and managing exercises, and reusing them as composed sets"
DESCRIPTION = "This package makes it easier to maintain and edit your exercise \
sets. Exercises are saved as separate files containing part \
problems. These files can be used to make sets, and you can \
cherry-pick or exclude certain part problems as you see fit."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn50448"

RPM_NAME = "texlive-exercisebank-2023.201.0.0.3.0svn50448-52.1.noarch.rpm"
RPM_HASH = "7df3275da1a25a22149c44e631c2a2bdc8947670bc407f04fcf69b40e9a78fd9d7b5538e17599218587de36a952007002a653c41d15d3ed10265e8d09a58a43b"
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
