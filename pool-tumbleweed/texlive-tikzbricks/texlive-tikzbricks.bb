SUMMARY = "Drawing bricks with TikZ"
DESCRIPTION = "A small LaTeX package to draw bricks with TikZ. The user can \
modify color, shape, and viewpoint."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn63952"

RPM_NAME = "texlive-tikzbricks-2023.201.0.0.4svn63952-52.1.noarch.rpm"
RPM_HASH = "05ce25cb3dde728a7a5f792b8da13a35ec6bbfa26d5b131ccaeabc59ba7173a59b06602b454b1ccb0794d458a4fdf13c72fc1408193655f8fd43b275a48f304c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzbricks.sty) \
texlive-tikzbricks"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz-3dplot.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
