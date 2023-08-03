SUMMARY = "Boxes that may break across pages"
DESCRIPTION = "Defines environments that allow page breaks inside framed boxes \
whose edges may be variously fancy. The bundle includes a few \
examples (shaded box, box with a wavy line on its side, etc)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn32235"

RPM_NAME = "texlive-boites-2023.209.1.1svn32235-53.1.noarch.rpm"
RPM_HASH = "f2a2a151981013998856efa2c1e742b85b64d41b721cc9b3ec1557cf6a4d5e98486fb80094936b2a4c5593cba62e69af62198f0782d4a42a1071b6dbc71e6300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boites-exemples.sty \
tex-boites.sty \
texlive-boites"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
