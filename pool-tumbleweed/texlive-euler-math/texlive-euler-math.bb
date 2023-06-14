SUMMARY = "OpenType version of Hermann Zapf's Euler maths font"
DESCRIPTION = "Euler-Math.otf (formerly named 'Neo-Euler.otf') is an OpenType \
version of Hermann Zapf's Euler maths font. It is the \
continuation of the Euler project initiated by Khaled Hosny in \
2009 and abandoned in 2016. A style file euler-math.sty is \
provided as a replacement of the eulervm package for LuaLaTeX \
and XeLaTeX users."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.31svn65685"

RPM_NAME = "texlive-euler-math-2023.201.0.0.31svn65685-52.1.noarch.rpm"
RPM_HASH = "bb3a1dfbb74184aabaebf26146f4e6f55960892893cf563e8572c18c036c9494b98e61ae2d19134a959ec174ec8ca13c4e897172ad31ad4a616d35c9c38326eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euler-math.sty \
tex-neo-euler.sty \
texlive-euler-math"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-euler-math-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
