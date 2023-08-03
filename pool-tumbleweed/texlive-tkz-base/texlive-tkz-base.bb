SUMMARY = "Tools for drawing with a cartesian coordinate system"
DESCRIPTION = "The bundle is a set of packages, designed to give mathematics \
teachers (and students) easy access to programming of drawings \
with TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2csvn66115"

RPM_NAME = "texlive-tkz-base-2023.209.4.2csvn66115-53.1.noarch.rpm"
RPM_HASH = "da9a00be941edd4a21770a76f36f1f1255673efd3d5bbb6c41bab79ebea23d3e123d799ea98f0bb4d560d66da2713c55ff4ab9f5dece4698d2fc11462322bc18"
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

RDEPENDS:${PN} += "/usr/bin/sh \
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
