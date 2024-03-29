SUMMARY = "A presentation class"
DESCRIPTION = "Powerdot is a presentation class for LaTeX that allows for the \
quick and easy development of professional presentations. It \
comes with many tools that enhance presentations and aid the \
presenter. Examples are automatic overlays, personal notes and \
a handout mode. To view a presentation, DVI, PS or PDF output \
can be used. A powerful template system is available to easily \
develop new styles. A LyX layout file is provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn59272"

RPM_NAME = "texlive-powerdot-2023.209.1.7svn59272-53.1.noarch.rpm"
RPM_HASH = "2ba1eb4d0619167481e2cfd9a198ea945ca63ed18e71bae6f1ddb1b96597183da9429f3b10e863339ddd9ac9a47362973f82a01d62b79e28d5072d8bb73cfabf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-powerdot-aggie.sty \
tex-powerdot-bframe.sty \
tex-powerdot-ciment.sty \
tex-powerdot-default.sty \
tex-powerdot-elcolors.sty \
tex-powerdot-fyma.sty \
tex-powerdot-horatio.sty \
tex-powerdot-husky.sty \
tex-powerdot-ikeda.sty \
tex-powerdot-jefka.sty \
tex-powerdot-klope.sty \
tex-powerdot-paintings.sty \
tex-powerdot-pazik.sty \
tex-powerdot-sailor.sty \
tex-powerdot-simple.sty \
tex-powerdot-tycja.sty \
tex-powerdot-upen.sty \
tex-powerdot.cls \
texlive-powerdot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-article.cls \
tex-calc.sty \
tex-enumitem.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifxetex.sty \
tex-pdfbase.sty \
tex-pifont.sty \
tex-pst-blur.sty \
tex-pst-char.sty \
tex-pst-grad.sty \
tex-pst-ovl.sty \
tex-pst-slpe.sty \
tex-pstricks.sty \
tex-times.sty \
tex-type1cm.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
