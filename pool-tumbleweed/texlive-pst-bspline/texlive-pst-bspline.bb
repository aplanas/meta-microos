SUMMARY = "Draw cubic Bspline curves and interpolations"
DESCRIPTION = "The package draws uniform, cubic B-spline curves, open and \
closed, based on a sequence of B-spline control points. There \
is also code which permits drawing the open or closed cubic \
Bspline curve interpolating a sequence of points. Graphical \
output is created using PStricks."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.62svn40685"

RPM_NAME = "texlive-pst-bspline-2023.201.1.62svn40685-52.1.noarch.rpm"
RPM_HASH = "552d08c03b87be4d1e489d1a00587730138487472a549dfa9c21d3087ffe95ff7a5736b79c54dc748624ce1e7267a34cfb31b845fec9b0fc6ed4871242a52955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-bspline.sty) \
tex(pst-bspline.tex) \
texlive-pst-bspline"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(multido.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
