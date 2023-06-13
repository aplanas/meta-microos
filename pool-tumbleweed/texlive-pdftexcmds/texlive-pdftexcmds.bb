SUMMARY = "LuaTeX support for pdfTeX utility functions"
DESCRIPTION = "LuaTeX provides most of the commands of pdfTeX 1.40. However, a \
number of utility functions are not available. This package \
tries to fill the gap and implements some of the missing \
primitives using Lua."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.33svn55777"

RPM_NAME = "texlive-pdftexcmds-2023.201.0.0.33svn55777-51.1.noarch.rpm"
RPM_HASH = "c86d4dc797aa0a8bc966fc31fd24666cd54716e94bf2327febfe4b0f2d759a181301c5cc2ee698f547546a87b5400bd46641c597d522f2d0d1d600d86097ae3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdftexcmds.sty) \
texlive-pdftexcmds"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(infwarerr.sty) \
tex(ltxcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
