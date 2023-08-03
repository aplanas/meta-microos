SUMMARY = "Draw beautiful Pascal (Yanghui) triangles"
DESCRIPTION = "This LaTeX3 package based on TikZ helps to generate beautiful \
Pascal (Yanghui) triangles. It provides a unique drawing macro \
\\pascal which can generate isosceles or right-angle triangles \
customized by means of different \\pascal macro options or the \
\\pascalset macro."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn61774"

RPM_NAME = "texlive-pascaltriangle-2023.209.1.0.1svn61774-52.1.noarch.rpm"
RPM_HASH = "132835075838c825fd0b7fd4d27d560512b76378c7975572d67824f8434a7db8dcfccb468213e33b0503891555162a4eea681363bd72c5155c9d97746b7f5543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pascaltriangle.sty \
texlive-pascaltriangle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
