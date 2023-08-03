SUMMARY = "Using LuaLaTeX together with PostScript code"
DESCRIPTION = "This package is a slightly modified version of auto-pst-pdf by \
Will Robertson, which itself is a wrapper for pst-pdf by Rolf \
Niepraschk. The package allows the use of LuaLaTeX together \
with PostScript related code, eg. PSTricks. It depends on \
ifpdf, ifluatex, ifplatform, and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn54779"

RPM_NAME = "texlive-auto-pst-pdf-lua-2023.209.0.0.03svn54779-54.1.noarch.rpm"
RPM_HASH = "36269ea400ef9503ef090fc4c047f35b77254c5e35bf55a94a056bdedd0f70bb78f8d4d584beb130a234f0d31e61c7cd966dacdf40b6e923337979760b6f0312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-auto-pst-pdf-lua.sty \
texlive-auto-pst-pdf-lua"

RDEPENDS:${PN} += "/usr/bin/sh \
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
