SUMMARY = "A LuaLaTeX package for drawing karnaugh maps with up to 6 variables"
DESCRIPTION = "This package, a fork of 2pi's karnaugh-map package, draws \
karnaugh maps with 2, 3, 4, 5, and 6 variables. It also \
contains commands for filling the karnaugh map with terms \
semi-automatically or manually. Last but not least it contains \
commands for drawing implicants on top of the map. The name \
'cartonaugh' is a portmanteau of 'cartographer' and 'karnaugh'. \
The package needs LuaLaTeX and depends on TikZ, xparse, and \
xstring."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn59938"

RPM_NAME = "texlive-cartonaugh-2023.209.1.0svn59938-53.1.noarch.rpm"
RPM_HASH = "e42f6c142b265be91bc11f5599a1e1c068f12314a33759560844793d32a19949fc5cb04f0142831b687556277352959e2d6620789d7fa11e8e522e30a8205b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cartonaugh.sty \
texlive-cartonaugh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
