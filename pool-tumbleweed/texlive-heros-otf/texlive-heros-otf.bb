SUMMARY = "Using the OpenType fonts TeX Gyre Heros>"
DESCRIPTION = "This package can only be used with LuaLaTeX or XeLaTeX. It does \
the font setting for the OpenType font 'TeX Gyre Heros'. The \
condensed versions of the fonts are also supported. The missing \
typefaces for slanted text are also defined."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn64695"

RPM_NAME = "texlive-heros-otf-2023.209.0.0.01svn64695-54.2.noarch.rpm"
RPM_HASH = "07e6c0dbb6e788c34f97ccd8918695ee46c59704b36ed4a85e7531baefac1984eab7ebdd896306b0eca93efe5183f75778e16946ce3aacc201c74da017f5b317"
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
