SUMMARY = "Creates miniature documents inside other LaTeX documents"
DESCRIPTION = "This package can be used to create miniature documents inside \
other LaTeX documents. Inside the minidocument all features of \
the outer vertical mode like page breaking, floats, marginpars, \
etc. are available."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn43752"

RPM_NAME = "texlive-minidocument-2023.209.1.0svn43752-55.1.noarch.rpm"
RPM_HASH = "b8d39f1e65a8098aa3528fd2388408ef411375cae9d9139baab0d8b3b4cb8674ffd4b57e91da4b4e515c2200a9759fc7fe58a18222c3ea683a4aad09f85b1a16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minidocument.sty \
texlive-minidocument"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
