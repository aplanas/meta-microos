SUMMARY = "Embed non-PDF files into PDF with hyperlink"
DESCRIPTION = "The package allows to embed non-PDF files (e.g., BibTeX) into \
PDF with a hyperlink."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn63987"

RPM_NAME = "texlive-intopdf-2023.209.0.0.4.1svn63987-54.1.noarch.rpm"
RPM_HASH = "3062aa22811a13528980576959a17937324bffdea61ab16acf119521c56d584b95fbdd68d3d32cc7cdc926766d1bab5433bf0b697c742b63a273f3ae50848e04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-intopdf.sty \
texlive-intopdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-hyperref.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
