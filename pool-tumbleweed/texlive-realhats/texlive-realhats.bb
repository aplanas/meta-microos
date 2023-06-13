SUMMARY = "Put real hats on symbols instead of ^"
DESCRIPTION = "This LaTeX package makes \\hat put real hats on symbols. The \
package depends on amsmath, calc, graphicx, ifthen, lcg, and \
stackengine."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0svn63595"

RPM_NAME = "texlive-realhats-2023.201.6.0svn63595-53.1.noarch.rpm"
RPM_HASH = "0c82db196fab085ccc297a0086fa8be00bb75a93f66aac7c9450582991cb2fe7402c0c163777cd38527f5e57763cbcf8c599d5041e8afe5ff2756e7654498cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(realhats.sty) \
texlive-realhats"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(calc.sty) \
tex(graphicx.sty) \
tex(ifthen.sty) \
tex(lcg.sty) \
tex(stackengine.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
