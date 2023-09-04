SUMMARY = "Inline images in base64 encoding"
DESCRIPTION = "The package provides a command \\inlineimg to dynamically create \
a file containing the inline image in base64 format, which is \
decoded and included in the source file. Requirements LaTeX \
must be run with option --shell-escape. Program base64."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-inline-images-2023.209.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "6f4d8132c671d31588288c160092178487431ee2594faa653788024996af561e4ee0aeeaac00e3860c61709759a14deafad34726b73bce5af0dbb81c5d283b24"
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
