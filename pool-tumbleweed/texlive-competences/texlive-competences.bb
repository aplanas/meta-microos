SUMMARY = "Track skills of classroom checks"
DESCRIPTION = "This package is an attempt to track skills assessed during a \
classroom check. Each question can be associated with one or \
more skills and be assigned a number of points to be earned. At \
the end of the text, a table set summarizes the skills \
assessed, and in what proportions."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47573"

RPM_NAME = "texlive-competences-2023.201.1.0svn47573-53.1.noarch.rpm"
RPM_HASH = "9fc4f41a73761986573a23890cad94449492b62de314261ffb1bfe88c9d3cfba37e8259b5f1a784bb858e65254763c09647d4a0b97a2184e356051da8428cad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(competences.sty) \
texlive-competences"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(datatool.sty) \
tex(etoolbox.sty) \
tex(longtable.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
