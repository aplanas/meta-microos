SUMMARY = "Formats a number by inserting commas"
DESCRIPTION = "A flexible package that allows commas (or anything else) to be \
inserted every three digits in a number, as in 1,234."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn18259"

RPM_NAME = "texlive-comma-2023.201.1.2svn18259-53.1.noarch.rpm"
RPM_HASH = "dd29b8ad4e1507bcb064d3d4879c35eb6ea0e7241b478383d00f779d466ade5c8afb7e9b54a25bbef777f49b0c14415c942649516d5007ce7f991a097e8fff3f"
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
