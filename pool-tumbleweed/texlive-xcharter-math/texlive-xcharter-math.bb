SUMMARY = "XCharter-based OpenType Math font for LuaTeX and XeTeX"
DESCRIPTION = "This package provides an Unicode Math font XCharter-Math.otf \
meant to be used together with XCharter Opentype Text fonts \
(extension of Bitstream Charter) in LuaLaTeX or XeLaTeX \
documents."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-2023.201.0.0.36svn65686-52.1.noarch.rpm"
RPM_HASH = "523d216dc6f27616668e27d81fb72659bb81a3f6ae6d2254ed294d72ac2314d7b2d83190a1474aa35266612b40e39f14277b80b3b9123021c1e9cea885dd474d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xcharter-otf.sty) \
texlive-xcharter-math"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(realscripts.sty) \
tex(unicode-math.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xcharter-math-fonts"

inherit rpm
