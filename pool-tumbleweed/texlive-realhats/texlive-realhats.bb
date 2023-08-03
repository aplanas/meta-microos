SUMMARY = "Put real hats on symbols instead of ^"
DESCRIPTION = "This LaTeX package makes \\hat put real hats on symbols. The \
package depends on amsmath, calc, graphicx, ifthen, lcg, and \
stackengine."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0svn63595"

RPM_NAME = "texlive-realhats-2023.209.6.0svn63595-54.1.noarch.rpm"
RPM_HASH = "825bc16e2d6b02cd211b6187c250c98184e446f162a073e3cd23bc3047c33f9fee38906f7428d0e543e001ec88bd15bfadabacfa295d6f007d840bc231a336f5"
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
