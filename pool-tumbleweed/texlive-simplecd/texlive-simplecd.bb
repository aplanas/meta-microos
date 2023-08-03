SUMMARY = "Simple CD, DVD covers for printing"
DESCRIPTION = "The package provides printable cut-outs for various CD, DVD and \
other disc holders. The name of the package comes from its \
implementation and ease of use; it was designed just for text \
content, but since the text is placed in a \\parbox in a tabular \
environment cell, a rather wide range of things may be placed."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn29260"

RPM_NAME = "texlive-simplecd-2023.209.1.4svn29260-54.1.noarch.rpm"
RPM_HASH = "eccb64869b4d1ad3b5eda8df4c3ab388e742ef6655d760cb240a1ae7e576dd9d8ccc2fac94ea8ac4b0bf26e6d84e425a1278bdfe27f3cf4d8fce0eb9f9a1a943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplecd.sty \
texlive-simplecd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fix-cm.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
