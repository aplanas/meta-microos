SUMMARY = "Using the OpenType fonts TeX Gyre Termes"
DESCRIPTION = "This package provides the OpenType version of the TeX Gyre \
Termes font, including text and math fonts. The package needs \
LuaLaTeX or XeLaTeX. The missing typefaces like bold math and \
slanted text are also defined."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn64733"

RPM_NAME = "texlive-termes-otf-2023.209.0.0.02svn64733-55.1.noarch.rpm"
RPM_HASH = "da246bd3aba96e53110ff775d518f8fcddb7387e542cd4199c7bd15e788b66b7ee4b4860a173dcffc1c45dbb300b6e70914ed92973bd21d0aaec5d0c8fd0401c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termes-otf.sty \
texlive-termes-otf"

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
