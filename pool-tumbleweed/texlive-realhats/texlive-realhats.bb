SUMMARY = "Put real hats on symbols instead of ^"
DESCRIPTION = "This LaTeX package makes \\hat put real hats on symbols. The \
package depends on amsmath, calc, graphicx, ifthen, lcg, and \
stackengine."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0svn63595"

RPM_NAME = "texlive-realhats-2023.209.6.0svn63595-54.2.noarch.rpm"
RPM_HASH = "01c8133844471f3c240a2b4323df317e9c4e893c638d132666f1d60f83ac141c322d9606c107ef7a71abffd17a531647a1418e5641bd88185320dcab02abfadc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realhats.sty \
texlive-realhats"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-lcg.sty \
tex-stackengine.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
