SUMMARY = "Plot pulleys, using PSTricks"
DESCRIPTION = "The package enables the user to draw pulley systems with up to \
6 pulleys. The pulley diagrams are labelled with the physical \
properties of the system. The package uses pstricks and \
requires several PSTricks-related packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn62977"

RPM_NAME = "texlive-pst-pulley-2023.209.0.0.02svn62977-54.1.noarch.rpm"
RPM_HASH = "cd3abbfb1e568a8a424bc20cd10c0dd893cf835ab4096889a2a4e758b61dc66482040ebc550280d30fe95fa4a444a7c02b348bca4fb6675cb3618cdaa2d298ba"
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
