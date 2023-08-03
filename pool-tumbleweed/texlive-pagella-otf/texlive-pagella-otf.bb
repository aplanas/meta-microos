SUMMARY = "Using the OpenType fonts TeX Gyre Pagella"
DESCRIPTION = "This package can only be used with LuaLaTeX or XeLaTeX. It does \
the font setting for the OpenType font 'TeX Gyre Pagella' for \
text and math. The missing typefaces like bold math and slanted \
text are also defined"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn64705"

RPM_NAME = "texlive-pagella-otf-2023.209.0.0.02svn64705-52.1.noarch.rpm"
RPM_HASH = "5b53ff7a97a8557c59d1d19a57674187a7912da79fcd13e1cc6bcdff2601739fad4072b84314dd4b08c753ef0cfd2dd0c9f3475d4dee087a336cbdc9a377da9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagella-otf.sty \
texlive-pagella-otf"

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
