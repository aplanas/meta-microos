SUMMARY = "Produces bar charts using PSTricks"
DESCRIPTION = "The package uses pstricks to draw bar charts from data stored \
in a comma-delimited file. Several types of bar charts may be \
drawn, and the drawing parameters are highly customizable. No \
external packages are required except those that are part of \
the standard PSTricks distribution."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.93svn64331"

RPM_NAME = "texlive-pst-bar-2023.209.0.0.93svn64331-53.1.noarch.rpm"
RPM_HASH = "047258fa6f06ccd68ad25bc40f28f5c3e036a0b5028848e2c40f8579c5e905997957177e5c3ceb2f4cd99c330664205162d5659fbdedf657ce9d0de67bd5f7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-bar.sty \
tex-pst-bar.tex \
texlive-pst-bar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
