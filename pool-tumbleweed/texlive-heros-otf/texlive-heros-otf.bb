SUMMARY = "Using the OpenType fonts TeX Gyre Heros>"
DESCRIPTION = "This package can only be used with LuaLaTeX or XeLaTeX. It does \
the font setting for the OpenType font 'TeX Gyre Heros'. The \
condensed versions of the fonts are also supported. The missing \
typefaces for slanted text are also defined."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn64695"

RPM_NAME = "texlive-heros-otf-2023.201.0.0.01svn64695-53.2.noarch.rpm"
RPM_HASH = "e0cd04ffaec49bfb78c3835ef239bba96d6c0d2dce8f9c543b58a372d8b18f1e987b1b16dc153584a2f5fa24b5dda8ca00d74c9ad2099e46c2cca211593df2fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-heros-otf.sty \
texlive-heros-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-textcomp.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
