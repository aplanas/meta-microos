SUMMARY = "A document class for quickly drafting nice looking lecture notes"
DESCRIPTION = "This LaTeX documentclass provides a number of gimmicks to draft \
nice looking lecture notes, such as a number of theorem \
environments, automatic spacing and alignment of figures and \
much more. More information is available in the package readme."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.5svn53642"

RPM_NAME = "texlive-lectures-2023.209.1.0.5svn53642-55.1.noarch.rpm"
RPM_HASH = "ab491447efa55eafb117d26766a0e4a5109f7b0d88005dce46cd41e8fcf0927d63f9afdc3247bca119a7acc6b689381ae58ec1a2d6a3fcc77c83a8900364dcdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lectures.cls \
texlive-lectures"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adigraph.sty \
tex-algorithm2e.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-bm.sty \
tex-bodegraph.sty \
tex-caption.sty \
tex-centernot.sty \
tex-circuitikz.sty \
tex-csquotes.sty \
tex-diagbox.sty \
tex-emptypage.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-fourier.sty \
tex-fp.sty \
tex-framed.sty \
tex-gensymb.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-marvosym.sty \
tex-microtype.sty \
tex-minted.sty \
tex-multicol.sty \
tex-paralist.sty \
tex-parskip.sty \
tex-pgfplots.sty \
tex-quotchap.sty \
tex-relsize.sty \
tex-report.cls \
tex-sectsty.sty \
tex-silence.sty \
tex-soul.sty \
tex-stmaryrd.sty \
tex-subcaption.sty \
tex-subfiles.sty \
tex-tcolorbox.sty \
tex-tikz-qtree.sty \
tex-tikz.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xfrac.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
