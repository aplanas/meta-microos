SUMMARY = "Overfull pages with ConTeXt"
DESCRIPTION = "The (ConTeXt) module allows insertion of thought breaks in \
texts. With parameters one can adjust the spacing around the \
content and set a default symbol."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-fancybreak-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "31f244368445cc0479466a48fb534c839df9121abe59bea49064b113879a07c9b51c95b8d021a698d8202f6a526beac28b8af1cfea7111f41f3d978114dbd27b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-fancybreak"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
