SUMMARY = "Print vectors, matrices, and tensors"
DESCRIPTION = "This package provides commands for vectors, matrices, and \
tensors with different styles -- arrows (as the LaTeX default), \
underlined, and bold."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.61svn54080"

RPM_NAME = "texlive-hhtensor-2023.201.0.0.61svn54080-53.2.noarch.rpm"
RPM_HASH = "9c7b76370fe71d1673d2c6c18ca01fe665cd4543256f7a52bace7302ccae5eaf1b32b73d7420599ca301f15be9898ec272851a445dd745dbeb545d21fc7cdd8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hhtensor.sty \
texlive-hhtensor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-ushort.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
