SUMMARY = "Draws sticks for games of multi-pile Nim"
DESCRIPTION = "This LaTeX package provides commands \\drawnimstick to draw a \
single nim stick and \\nimgame which represents games of \
multi-pile Nim. Nim sticks are drawn with a little random \
wobble so they look 'thrown together' and not too regular. The \
package also provides options to customise the size and colour \
of the sticks, and flexibility to draw heaps of different \
objects."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.1svn64118"

RPM_NAME = "texlive-nimsticks-2023.209.2.0.1svn64118-55.1.noarch.rpm"
RPM_HASH = "ced68b12f6ff2f8f1b322f5661a00294395ba73b41245a905279c59e464c0088b361b554fc44ef3bd3b3f7281cb285758e75e1d2f3ddcd5046bd96fb92418726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nimsticks.sty \
texlive-nimsticks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-lcg.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
