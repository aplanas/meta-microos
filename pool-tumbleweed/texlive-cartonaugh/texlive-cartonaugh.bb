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

PV = "2023.201.1.0svn59938"

RPM_NAME = "texlive-cartonaugh-2023.201.1.0svn59938-52.1.noarch.rpm"
RPM_HASH = "ce498d260c7ea31075c3c2c01282a57b1c35b907f37b00de87d141d781b8991f179e90ec0fa5cb9402bf8c9e8bb0a5b6555c7127bc9e88ca759f7120d015a589"
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
