SUMMARY = "Plot pulleys, using PSTricks"
DESCRIPTION = "The package enables the user to draw pulley systems with up to \
6 pulleys. The pulley diagrams are labelled with the physical \
properties of the system. The package uses pstricks and \
requires several PSTricks-related packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn62977"

RPM_NAME = "texlive-pst-pulley-2023.209.0.0.02svn62977-54.2.noarch.rpm"
RPM_HASH = "0b2d688539855c0519b7a73689f9f1c428939c906b967eb6128bcf8e7be75ebd731c463bc109b1ad8659a8541578b0dfa7f62b64bd2c5d83d02023e9c7e9df68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-pulley.sty \
tex-pst-pulley.tex \
texlive-pst-pulley"

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
