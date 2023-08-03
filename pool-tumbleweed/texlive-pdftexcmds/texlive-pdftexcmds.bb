SUMMARY = "LuaTeX support for pdfTeX utility functions"
DESCRIPTION = "LuaTeX provides most of the commands of pdfTeX 1.40. However, a \
number of utility functions are not available. This package \
tries to fill the gap and implements some of the missing \
primitives using Lua."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.33svn55777"

RPM_NAME = "texlive-pdftexcmds-2023.209.0.0.33svn55777-52.1.noarch.rpm"
RPM_HASH = "de5cfd57edf6bb75f2511988dca8eea100dd87365add0fc7eb3e2371add052862fc139ee81b0696fa43f41c8f047fd86f67672ba3996ecf3f206220b5b0154f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdftexcmds.sty \
texlive-pdftexcmds"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
