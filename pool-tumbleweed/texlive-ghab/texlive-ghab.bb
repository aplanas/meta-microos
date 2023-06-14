SUMMARY = "Typeset ghab boxes in LaTeX"
DESCRIPTION = "The package defines a command \\darghab that will typeset its \
argument in a box with a decorated frame. The width of the box \
may be set using an optional argument."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn29803"

RPM_NAME = "texlive-ghab-2023.201.0.0.5svn29803-52.1.noarch.rpm"
RPM_HASH = "68cc72cd8812f82ca81d4a0f99dffb1037a975b2f58624d3105af7b0a8b623a8c2ff1160df09a84f7f8b66793c1b9f470e3220ef75df845f03d5d3edbc816cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ghab.sty \
texlive-ghab"

RDEPENDS:${PN} += "/bin/sh \
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
