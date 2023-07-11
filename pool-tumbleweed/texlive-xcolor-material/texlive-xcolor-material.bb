SUMMARY = "Defines the 256 colors from Google Material Color Palette"
DESCRIPTION = "The package is built on top of the great xcolor package. It \
provides a useful definition of the beautiful Google Material \
Color Palette, available at Google Material design, for its use \
in document writing with LaTeX and Friends."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn42289"

RPM_NAME = "texlive-xcolor-material-2023.201.0.0.1svn42289-52.2.noarch.rpm"
RPM_HASH = "af2093697fd56346b80d9c8f2c559442af96b0d36bf860c9101154f893c82abee93834b6d372fdfbbe8aff12f4a8669363a08d037fd0ef6bbc358bd68aa2a02f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcolor-material.sty \
texlive-xcolor-material"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
