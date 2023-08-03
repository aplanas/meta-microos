SUMMARY = "Defines the 256 colors from Google Material Color Palette"
DESCRIPTION = "The package is built on top of the great xcolor package. It \
provides a useful definition of the beautiful Google Material \
Color Palette, available at Google Material design, for its use \
in document writing with LaTeX and Friends."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn42289"

RPM_NAME = "texlive-xcolor-material-2023.209.0.0.1svn42289-53.1.noarch.rpm"
RPM_HASH = "7353ecf1bb3f85e94dc576fe3fb2aa8bc77c15257c09766350d75ab4a29e61e79e2a2bfb39b8b22ba83a2b452e19ded16ce8bd233fe7361f633bb0d70061b0b6"
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
