SUMMARY = "Draw rulers around a box"
DESCRIPTION = "This is a LaTeX package for drawing rulers around a box. This \
might be useful when showing the absolute size of something in \
electronic documents, or designating the relative scale in \
printed materials."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn50984"

RPM_NAME = "texlive-rulerbox-2023.209.1.01svn50984-54.1.noarch.rpm"
RPM_HASH = "febfe92ced17da61ceef78900efc83480fbb6239d00fa3f7e7cdfa4e25b623846535773457328a30e4e92671e11e2a1772941fd71f4d3aea289b35f1d279f211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rulerbox.sty \
texlive-rulerbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
