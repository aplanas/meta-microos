SUMMARY = "Using LuaLaTeX together with PostScript code"
DESCRIPTION = "This package is a slightly modified version of auto-pst-pdf by \
Will Robertson, which itself is a wrapper for pst-pdf by Rolf \
Niepraschk. The package allows the use of LuaLaTeX together \
with PostScript related code, eg. PSTricks. It depends on \
ifpdf, ifluatex, ifplatform, and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn54779"

RPM_NAME = "texlive-auto-pst-pdf-lua-2023.201.0.0.03svn54779-53.1.noarch.rpm"
RPM_HASH = "f3c88d721e36f460791c7c8315a677f0a459a85d876f66dcd207b6df5826c1fd088670b60e68599d3345b9a94345f6dc0977cf7d541fdbbce5d98321a21efd82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-auto-pst-pdf-lua.sty \
texlive-auto-pst-pdf-lua"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-pst-pdf.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
