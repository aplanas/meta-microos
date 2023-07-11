SUMMARY = "Put real hats on symbols instead of ^"
DESCRIPTION = "This LaTeX package makes \\hat put real hats on symbols. The \
package depends on amsmath, calc, graphicx, ifthen, lcg, and \
stackengine."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0svn63595"

RPM_NAME = "texlive-realhats-2023.201.6.0svn63595-53.2.noarch.rpm"
RPM_HASH = "4b92eaeae06c78ffa53cd72002bdb5169b2da93d26aaecd8784b83b59b70df5629e53a05c29fd5861fa2c4a6e60789f268f7f38cb2f241ff38d33adeaf5e202f"
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
