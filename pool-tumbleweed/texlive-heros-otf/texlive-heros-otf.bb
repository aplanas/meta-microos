SUMMARY = "Using the OpenType fonts TeX Gyre Heros>"
DESCRIPTION = "This package can only be used with LuaLaTeX or XeLaTeX. It does \
the font setting for the OpenType font 'TeX Gyre Heros'. The \
condensed versions of the fonts are also supported. The missing \
typefaces for slanted text are also defined."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn64695"

RPM_NAME = "texlive-heros-otf-2023.209.0.0.01svn64695-54.1.noarch.rpm"
RPM_HASH = "fcfbd681ebb4eab1c560d8afb8939c8de6e30cfeece8e88fccc69792514037d9f35a5ba43acac6da6db610368fafe5e8574327f9ac5249c6ad669400c04ad42b"
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
