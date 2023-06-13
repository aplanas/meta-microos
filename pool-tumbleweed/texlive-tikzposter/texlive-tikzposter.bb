SUMMARY = "Create scientific posters using TikZ"
DESCRIPTION = "A document class provides a simple way of using TikZ for \
generating posters. Several formatting options are available, \
and spacing and layout of the poster is to a large extent \
automated."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn32732"

RPM_NAME = "texlive-tikzposter-2023.201.2.0svn32732-52.1.noarch.rpm"
RPM_HASH = "c81e57ee92180dee1ca269909e0290bbc6232c51af2935e1cd46b3aa3e81b8b17b7e8cf3e2a7aaeb7e340aaa2cefdab82b71faa5dcd42fa3cfe092607eec0bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzposter.cls) \
tex(tikzposterBackgroundstyles.tex) \
tex(tikzposterBlockstyles.tex) \
tex(tikzposterColorpalettes.tex) \
tex(tikzposterColorstyles.tex) \
tex(tikzposterInnerblockstyles.tex) \
tex(tikzposterLayoutthemes.tex) \
tex(tikzposterNotestyles.tex) \
tex(tikzposterTitlestyles.tex) \
texlive-tikzposter"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(a0size.sty) \
tex(ae.sty) \
tex(calc.sty) \
tex(etoolbox.sty) \
tex(extarticle.cls) \
tex(geometry.sty) \
tex(ifthen.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
