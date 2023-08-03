SUMMARY = "Printing ornaments"
DESCRIPTION = "The package uses PSTricks to draw ornaments (a substantial \
repertoire of ornaments is provided)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.41svn60488"

RPM_NAME = "texlive-pst-vectorian-2023.209.0.0.41svn60488-54.1.noarch.rpm"
RPM_HASH = "e8cdfeeb7deb730f52b4e51a365988ed0407c29cc6e0eaaf9596fe31d66514440fd26f1afd7736081bc6d71666460b901958859368a3d8c917c221f2c93ef9a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-psvectorian.sty \
texlive-pst-vectorian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
