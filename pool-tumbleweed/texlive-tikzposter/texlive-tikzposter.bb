SUMMARY = "Create scientific posters using TikZ"
DESCRIPTION = "A document class provides a simple way of using TikZ for \
generating posters. Several formatting options are available, \
and spacing and layout of the poster is to a large extent \
automated."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn32732"

RPM_NAME = "texlive-tikzposter-2023.209.2.0svn32732-53.1.noarch.rpm"
RPM_HASH = "bf0f37910c44ed326c35bb0f22892ad1165a667f894b19112231094dc556f08d047eaf8ee82865535dc8cca63235f187bd1ca0cf448bf5d0c4c70a5a1fb93c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzposter.cls \
tex-tikzposterBackgroundstyles.tex \
tex-tikzposterBlockstyles.tex \
tex-tikzposterColorpalettes.tex \
tex-tikzposterColorstyles.tex \
tex-tikzposterInnerblockstyles.tex \
tex-tikzposterLayoutthemes.tex \
tex-tikzposterNotestyles.tex \
tex-tikzposterTitlestyles.tex \
texlive-tikzposter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a0size.sty \
tex-ae.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-extarticle.cls \
tex-geometry.sty \
tex-ifthen.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
