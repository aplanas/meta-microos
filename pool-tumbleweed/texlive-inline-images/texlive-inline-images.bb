SUMMARY = "Inline images in base64 encoding"
DESCRIPTION = "The package provides a command \\inlineimg to dynamically create \
a file containing the inline image in base64 format, which is \
decoded and included in the source file. Requirements LaTeX \
must be run with option --shell-escape. Program base64."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-inline-images-2023.201.1.0svn61719-52.1.noarch.rpm"
RPM_HASH = "7cde4d2b85dd933a6fba05c249d5418974159f5dec68862468657f02dcdbe086e313129d2b7c57a5f2906a5b11ffcdefbf91dd346db24b4e9476f0212ed8a1b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(inline-images.sty) \
texlive-inline-images"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
