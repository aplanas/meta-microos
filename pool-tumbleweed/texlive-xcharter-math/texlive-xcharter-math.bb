SUMMARY = "XCharter-based OpenType Math font for LuaTeX and XeTeX"
DESCRIPTION = "This package provides an Unicode Math font XCharter-Math.otf \
meant to be used together with XCharter Opentype Text fonts \
(extension of Bitstream Charter) in LuaLaTeX or XeLaTeX \
documents."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-2023.209.0.0.36svn65686-53.1.noarch.rpm"
RPM_HASH = "08324a4918144b234a0fce2eef1597836d011defd8d94ac9ba7c4ba66dc6105beafce2b8b2fc7f70fc62c48c93dc4c881174dc5dcb81a536683a9506d657d505"
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
