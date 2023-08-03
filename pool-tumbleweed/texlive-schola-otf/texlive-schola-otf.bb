SUMMARY = "Using the OpenType fonts TeX Gyre schola"
DESCRIPTION = "This package can only be used with LuaLaTeX or XeLaTeX. It does \
the font setting for the OpenType font TeX Gyre Schola for text \
and math. The missing typefaces like bold math and slanted text \
are also defined"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn64734"

RPM_NAME = "texlive-schola-otf-2023.209.0.0.01svn64734-54.1.noarch.rpm"
RPM_HASH = "2c6f83cb9f1d35726a3a7d0ddf9aa41a57001505c595a8f5bf503eeba966ced4e17aad6d996b39c5109eb8e9e9f8de13f3e8c42594cc1b89212f83964ed1553a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schola-otf.sty \
texlive-schola-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
