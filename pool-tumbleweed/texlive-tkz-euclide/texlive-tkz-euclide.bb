SUMMARY = "Tools for drawing Euclidean geometry"
DESCRIPTION = "The tkz-euclide package is a set of files designed to give math \
teachers and students easy access to the programming of \
Euclidean geometry with TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.02csvn65724"

RPM_NAME = "texlive-tkz-euclide-2023.209.5.02csvn65724-53.1.noarch.rpm"
RPM_HASH = "bed0b5c8f908f23d3630cdc54d072d78eab52073a1b81e2e02f105069376bba729911afa1ed4b6007d6e38591d27cffb115fccfddfef1241b2a92441b98a7d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-draw-eu-angles.tex \
tex-tkz-draw-eu-circles.tex \
tex-tkz-draw-eu-compass.tex \
tex-tkz-draw-eu-lines.tex \
tex-tkz-draw-eu-points.tex \
tex-tkz-draw-eu-polygons.tex \
tex-tkz-draw-eu-protractor.tex \
tex-tkz-draw-eu-sectors.tex \
tex-tkz-draw-eu-show.tex \
tex-tkz-euclide.cfg \
tex-tkz-euclide.sty \
tex-tkz-lib-eu-marks.tex \
tex-tkz-lib-eu-shape.tex \
tex-tkz-obj-eu-axesmin.tex \
tex-tkz-obj-eu-circles-by.tex \
tex-tkz-obj-eu-circles.tex \
tex-tkz-obj-eu-grids.tex \
tex-tkz-obj-eu-lines.tex \
tex-tkz-obj-eu-points-by.tex \
tex-tkz-obj-eu-points-rnd.tex \
tex-tkz-obj-eu-points-spc.tex \
tex-tkz-obj-eu-points-with.tex \
tex-tkz-obj-eu-points.tex \
tex-tkz-obj-eu-polygons.tex \
tex-tkz-obj-eu-triangles.tex \
tex-tkz-obj-lua-circles.tex \
tex-tkz-obj-lua-points-by.tex \
tex-tkz-obj-lua-points-spc.tex \
tex-tkz-obj-lua-points-with.tex \
tex-tkz-obj-lua-points.tex \
tex-tkz-tools-eu-BB.tex \
tex-tkz-tools-eu-angles.tex \
tex-tkz-tools-eu-base.tex \
tex-tkz-tools-eu-colors.tex \
tex-tkz-tools-eu-intersections.tex \
tex-tkz-tools-eu-math.tex \
tex-tkz-tools-eu-modules.tex \
tex-tkz-tools-eu-text.tex \
tex-tkz-tools-eu-utilities.tex \
tex-tkz-tools-lua-angles.tex \
tex-tkz-tools-lua-base.tex \
tex-tkz-tools-lua-intersections.tex \
tex-tkz-tools-lua-math.tex \
texlive-tkz-euclide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
tex-tikz.sty \
tex-xfp.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
