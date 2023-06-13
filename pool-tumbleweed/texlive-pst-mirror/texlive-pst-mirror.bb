SUMMARY = "Images on a spherical mirror"
DESCRIPTION = "The package provides commands and supporting PostScript \
material for drawing images as if reflected by a spherical \
mirror."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn60506"

RPM_NAME = "texlive-pst-mirror-2023.201.1.02svn60506-52.1.noarch.rpm"
RPM_HASH = "1fb7db350d638256e970bfdea288d5979afeb8ac946126d6a5a4cdc7f54236986429fe40c3de37da664b7fe1c4ff6e3f17b02bba2395bb916376789fb07de580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-mirror.sty) \
tex(pst-mirror.tex) \
texlive-pst-mirror"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
