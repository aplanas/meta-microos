SUMMARY = "Using the OpenType fonts TeX Gyre schola"
DESCRIPTION = "This package can only be used with LuaLaTeX or XeLaTeX. It does \
the font setting for the OpenType font TeX Gyre Schola for text \
and math. The missing typefaces like bold math and slanted text \
are also defined"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn64734"

RPM_NAME = "texlive-schola-otf-2023.201.0.0.01svn64734-53.1.noarch.rpm"
RPM_HASH = "236abb4c820b8bd8e66f06d09b1f18b561f0c121a945d1e7a1ea468f4bc1d865ad40524b1325a1b14d4e66095e142eae590fbcfe539c1e3039928b59995cda92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schola-otf.sty \
texlive-schola-otf"

RDEPENDS:${PN} += "/bin/sh \
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
