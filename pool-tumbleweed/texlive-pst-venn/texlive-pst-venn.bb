SUMMARY = "A PSTricks package for drawing Venn sets"
DESCRIPTION = "This is a PSTricks related package for drawing Venn diagrams \
with three circles."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn49316"

RPM_NAME = "texlive-pst-venn-2023.201.0.0.01svn49316-53.1.noarch.rpm"
RPM_HASH = "de6f81ce535a42c8eb44fb9cada8d669a20a836fa775189625a92cef2a615597baa08ec0e0acdcd9ef0b3942c55ddc0d6c99613aff12400f9579263182e4a1cd"
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
