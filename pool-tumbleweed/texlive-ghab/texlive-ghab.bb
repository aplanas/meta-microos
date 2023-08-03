SUMMARY = "Typeset ghab boxes in LaTeX"
DESCRIPTION = "The package defines a command \\darghab that will typeset its \
argument in a box with a decorated frame. The width of the box \
may be set using an optional argument."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn29803"

RPM_NAME = "texlive-ghab-2023.209.0.0.5svn29803-53.1.noarch.rpm"
RPM_HASH = "26da51a3dafc1b796781a3a52cfce79d4f6e50ea5ddaf4c9bf249f284935966db643436fa0da7dc29055e686bd25fb2c6e79c7e79d64ee393e852c811b518ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ghab.sty \
texlive-ghab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
