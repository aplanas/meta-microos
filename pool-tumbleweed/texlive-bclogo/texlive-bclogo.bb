SUMMARY = "Creating colourful boxes with logos"
DESCRIPTION = "The package facilitates the creation of colorful boxes with a \
title and logo. It may use either tikz or PSTricks as graphics \
engine."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn39364"

RPM_NAME = "texlive-bclogo-2023.209.3.1svn39364-54.1.noarch.rpm"
RPM_HASH = "db677b00ebc3c3d2bf68e335a5919258aa0fd155c2bb9692a4bc4ed55f39d8f765e7af20c680a1ee634671a028e07eef51e56c63079ebf62e67b05b5a8af470c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bclogo.sty \
texlive-bclogo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-mdframed.sty \
tex-pst-blur.sty \
tex-pst-coil.sty \
tex-pst-grad.sty \
tex-pstricks.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
