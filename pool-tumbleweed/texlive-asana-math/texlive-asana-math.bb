SUMMARY = "A font to typeset maths in Xe(La)TeX and Lua(La)TeX"
DESCRIPTION = "The Asana-Math font is an OpenType font that includes almost \
all mathematical Unicode symbols and it can be used to typeset \
mathematical text with any software that can understand the \
MATH OpenType table (e.g., XeTeX 0.997 and Microsoft Word \
2007). The font is beta software. Typesetting support for use \
with LaTeX is provided by the fontspec and unicode-math \
packages."
LICENSE = "OFL-1.1"

PV = "2023.201.0.000.958svn59629"

RPM_NAME = "texlive-asana-math-2023.201.0.000.958svn59629-53.1.noarch.rpm"
RPM_HASH = "e728d7b50b20571515ff1aef9d86c636c510538d4558ca4c82755457d6086e25c1603373af596ef0f9fc94eb25bff8f5f3fd509a29e3c2fa0a06a6b6ee2ca743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asana-math"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-asana-math-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
