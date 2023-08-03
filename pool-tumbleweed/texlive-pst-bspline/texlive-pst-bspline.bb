SUMMARY = "Draw cubic Bspline curves and interpolations"
DESCRIPTION = "The package draws uniform, cubic B-spline curves, open and \
closed, based on a sequence of B-spline control points. There \
is also code which permits drawing the open or closed cubic \
Bspline curve interpolating a sequence of points. Graphical \
output is created using PStricks."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.62svn40685"

RPM_NAME = "texlive-pst-bspline-2023.209.1.62svn40685-53.1.noarch.rpm"
RPM_HASH = "8149cf658c11eb1b4cd2bee34a1b70813c958408cb5624f9e7dd83ab1f7115bb21aaa80a45a1a9015a8154bf5852ede81f53cf48c35000f4315e44eb621dbbd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-bspline.sty \
tex-pst-bspline.tex \
texlive-pst-bspline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
