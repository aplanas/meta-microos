SUMMARY = "Page numbering that continues between documents"
DESCRIPTION = "The package provides the facility that several documents can be \
typeset independently with page numbers in sequence, as if they \
were a single document."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-pagecont-2023.201.1.0svn15878-51.1.noarch.rpm"
RPM_HASH = "f336870c5d7a476e41b9698a6cc08d9cda60fdf13949eacb033f5a5d627d654ac2ed565f18cda2a508efa65f8e0dc9664b1648a61108dabe5a18a690de6ae55c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pagecont.sty) \
texlive-pagecont"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
