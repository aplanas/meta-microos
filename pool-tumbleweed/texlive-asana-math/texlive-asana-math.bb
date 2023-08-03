SUMMARY = "A font to typeset maths in Xe(La)TeX and Lua(La)TeX"
DESCRIPTION = "The Asana-Math font is an OpenType font that includes almost \
all mathematical Unicode symbols and it can be used to typeset \
mathematical text with any software that can understand the \
MATH OpenType table (e.g., XeTeX 0.997 and Microsoft Word \
2007). The font is beta software. Typesetting support for use \
with LaTeX is provided by the fontspec and unicode-math \
packages."
LICENSE = "OFL-1.1"

PV = "2023.209.0.000.958svn59629"

RPM_NAME = "texlive-asana-math-2023.209.0.000.958svn59629-54.1.noarch.rpm"
RPM_HASH = "f09d2152a3bc6d2c3e00b6fe9068051b42bbc866991fe69e2b8efccaee0467dd213e36229af2d7eaef5dbbe793f16214e53419167f2502635e40d2eea9d7251d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asana-math"

RDEPENDS:${PN} += "/usr/bin/sh \
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
