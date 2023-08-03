SUMMARY = "Cache includegraphics calls"
DESCRIPTION = "This LaTeX package provides caching of \\includegraphics calls, \
with several useful effects: Recompilations are much faster \
(10x speedup observed). Images can be postprocessed with \
ghostscript before inclusion, thus: Automatic downscaling to \
specified DPI Automatic JPEG compression with configurable \
quality Much smaller files (e.g. 10MB instead of 150MB)! Note: \
Due to the one-by-one invocation of pdflatex and ghostscript \
for each graphics element, the first compilation is typically \
slower than usual. Note: graphicscache needs the \\write18 call \
(also called shell escape). This is a security risk if you have \
untrusted TeX sources. graphicscache supports pdfLaTeX and \
LuaLaTeX; XeLaTeX is not supported."
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.4svn65318"

RPM_NAME = "texlive-graphicscache-2023.209.0.0.4svn65318-54.1.noarch.rpm"
RPM_HASH = "32750b9b95d107d447e8f50cac7ba9965cd0dc31c5caabb77a153a9154efa957a5ece3776f05bf14147dd918a0e06df03a296c339a8fe4d34484453694f134be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphicscache.sty \
texlive-graphicscache"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-filemod.sty \
tex-graphicx.sty \
tex-ifplatform.sty \
tex-letltxmacro.sty \
tex-ltxcmds.sty \
tex-pdftexcmds.sty \
tex-pgffor.sty \
tex-pgfopts.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
