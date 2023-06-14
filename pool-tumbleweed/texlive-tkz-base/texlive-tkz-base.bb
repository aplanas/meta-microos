SUMMARY = "Tools for drawing with a cartesian coordinate system"
DESCRIPTION = "The bundle is a set of packages, designed to give mathematics \
teachers (and students) easy access to programming of drawings \
with TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2csvn66115"

RPM_NAME = "texlive-tkz-base-2023.201.4.2csvn66115-52.1.noarch.rpm"
RPM_HASH = "e2d435785b8801ae42e7d2140146a6c7edcad89798d185944f6abf95919bff124904ad659ed27a580dd9caa06b839f48365ca10d756c5082fbf1b76864ea25f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-base.cfg \
tex-tkz-base.sty \
tex-tkz-lib-marks.tex \
tex-tkz-lib-shape.tex \
tex-tkz-obj-axes.tex \
tex-tkz-obj-grids.tex \
tex-tkz-obj-marks.tex \
tex-tkz-obj-points.tex \
tex-tkz-obj-rep.tex \
tex-tkz-tools-BB.tex \
tex-tkz-tools-arith.tex \
tex-tkz-tools-base.tex \
tex-tkz-tools-colors.tex \
tex-tkz-tools-misc.tex \
tex-tkz-tools-modules.tex \
tex-tkz-tools-print.tex \
tex-tkz-tools-text.tex \
tex-tkz-tools-utilities.tex \
texlive-tkz-base"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-numprint.sty \
tex-tikz.sty \
tex-xfp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
