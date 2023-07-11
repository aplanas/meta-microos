SUMMARY = "Visual debugging with LuaLaTeX"
DESCRIPTION = "The package uses lua code to provide visible indications of \
boxes, glues, kerns and penalties in the PDF output. The \
package is known to work in LaTeX and Plain TeX documents."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.9svn65464"

RPM_NAME = "texlive-lua-visual-debug-2023.208.0.0.9svn65464-53.1.noarch.rpm"
RPM_HASH = "ff3ea4b976fddac225a542ce3d70748bbe4881d2a949a6e45e9b3a8dfbb27875b21f61fa121b8f025db41ef6b2f5bf0dd0130ff0c321964adbfdbde563731a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lua-visual-debug.sty \
texlive-lua-visual-debug"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-ifluatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
