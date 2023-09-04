SUMMARY = "A PSTricks package for drawing Venn sets"
DESCRIPTION = "This is a PSTricks related package for drawing Venn diagrams \
with three circles."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn49316"

RPM_NAME = "texlive-pst-venn-2023.209.0.0.01svn49316-54.2.noarch.rpm"
RPM_HASH = "37760d781207b3e3de90a1e2d2e650e3ffe0248101e7164c79a186bea73846284084c1ea9033e68fddf839ca89625c27ded8dccf143cc2a1aeeee875f5e7ede5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-venn.sty \
texlive-pst-venn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
