SUMMARY = "XCharter-based OpenType Math font for LuaTeX and XeTeX"
DESCRIPTION = "This package provides an Unicode Math font XCharter-Math.otf \
meant to be used together with XCharter Opentype Text fonts \
(extension of Bitstream Charter) in LuaLaTeX or XeLaTeX \
documents."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-2023.209.0.0.36svn65686-53.2.noarch.rpm"
RPM_HASH = "c5852d9938f4204c507795a32f9c3ed659b427d2711aa7befa5cbda511aa970da0cff59022c26141cb0b919e7da6666ccc03e9a1d038498bd7b9cb7c711ebaca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcharter-otf.sty \
texlive-xcharter-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-realscripts.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xcharter-math-fonts"

inherit rpm
