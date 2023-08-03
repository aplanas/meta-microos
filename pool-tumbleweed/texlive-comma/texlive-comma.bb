SUMMARY = "Formats a number by inserting commas"
DESCRIPTION = "A flexible package that allows commas (or anything else) to be \
inserted every three digits in a number, as in 1,234."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn18259"

RPM_NAME = "texlive-comma-2023.209.1.2svn18259-54.1.noarch.rpm"
RPM_HASH = "e839432d7c3a9eaa51b277b4836cb9cab007a1b07f7d3863c2d1e9dfb0666b5b3cde223dd5cab3e3acf248b4a30e04ab4d380cb7862f7775a4ee9a451d7d4765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-comma.sty \
texlive-comma"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
