SUMMARY = "Printing ornaments"
DESCRIPTION = "The package uses PSTricks to draw ornaments (a substantial \
repertoire of ornaments is provided)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.41svn60488"

RPM_NAME = "texlive-pst-vectorian-2023.201.0.0.41svn60488-53.2.noarch.rpm"
RPM_HASH = "5019f98577c9ea35bfc0bfa7160d64761119cdec38db4fe5059c1aa425447eafe3eb0ed40836b34572d1c75f76fd7f211be27363794330cd05be288f45c385b6"
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
