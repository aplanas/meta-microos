SUMMARY = "OpenType version of Hermann Zapf's Euler maths font"
DESCRIPTION = "Euler-Math.otf (formerly named 'Neo-Euler.otf') is an OpenType \
version of Hermann Zapf's Euler maths font. It is the \
continuation of the Euler project initiated by Khaled Hosny in \
2009 and abandoned in 2016. A style file euler-math.sty is \
provided as a replacement of the eulervm package for LuaLaTeX \
and XeLaTeX users."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.31svn65685"

RPM_NAME = "texlive-euler-math-2023.209.0.0.31svn65685-53.1.noarch.rpm"
RPM_HASH = "aa51a6a0ac3b25bf532b6701dce111d93ea727fbc93a237fceb31fa75e428eca73f0434cd884292b7283c7f2dafec36c4606cf28b1832d7ef37b37bff6db6c87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euler-math.sty \
tex-neo-euler.sty \
texlive-euler-math"

RDEPENDS:${PN} += "/usr/bin/sh \
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
