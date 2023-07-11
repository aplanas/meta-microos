SUMMARY = "XCharter-based OpenType Math font for LuaTeX and XeTeX"
DESCRIPTION = "This package provides an Unicode Math font XCharter-Math.otf \
meant to be used together with XCharter Opentype Text fonts \
(extension of Bitstream Charter) in LuaLaTeX or XeLaTeX \
documents."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-2023.201.0.0.36svn65686-52.2.noarch.rpm"
RPM_HASH = "ced25fc4c2686af2caa75b3c76d0d826d683468073b79f7b1be0abdbda143dabd6a627313f7c02366cbdec5fc4b0eb3995baad480762323f5b38258cdad328e6"
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
