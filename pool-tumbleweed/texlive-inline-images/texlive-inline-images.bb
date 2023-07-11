SUMMARY = "Inline images in base64 encoding"
DESCRIPTION = "The package provides a command \\inlineimg to dynamically create \
a file containing the inline image in base64 format, which is \
decoded and included in the source file. Requirements LaTeX \
must be run with option --shell-escape. Program base64."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.208.1.0svn61719"

RPM_NAME = "texlive-inline-images-2023.208.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "922dd7032620ecf7add13f5d3ef0d1172d367e4fb1c2bb5ff1981dd0811d1908448403353f0ef866eb1eba835bf06a3ceee9a8e4bb00e299f5c2f766ef11b98d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inline-images.sty \
texlive-inline-images"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
