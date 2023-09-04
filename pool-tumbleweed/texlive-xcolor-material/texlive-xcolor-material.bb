SUMMARY = "Defines the 256 colors from Google Material Color Palette"
DESCRIPTION = "The package is built on top of the great xcolor package. It \
provides a useful definition of the beautiful Google Material \
Color Palette, available at Google Material design, for its use \
in document writing with LaTeX and Friends."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn42289"

RPM_NAME = "texlive-xcolor-material-2023.209.0.0.1svn42289-53.2.noarch.rpm"
RPM_HASH = "3f2c7369f584660e7dc4c02d02cf0a17a165e89575af63c4bd18ffe869ff4fe2ac99d0be1174d20bab3e8b9806f9f4afa5e974e8be5567163a7e7d747d11ba74"
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
