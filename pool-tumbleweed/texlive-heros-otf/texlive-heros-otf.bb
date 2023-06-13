SUMMARY = "Using the OpenType fonts TeX Gyre Heros>"
DESCRIPTION = "This package can only be used with LuaLaTeX or XeLaTeX. It does \
the font setting for the OpenType font 'TeX Gyre Heros'. The \
condensed versions of the fonts are also supported. The missing \
typefaces for slanted text are also defined."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn64695"

RPM_NAME = "texlive-heros-otf-2023.201.0.0.01svn64695-53.1.noarch.rpm"
RPM_HASH = "f4d47d0eb5a10098a70ebb6c0116c0ae6ab1c8678143b4622159194c8d46cc7e2f2279ca87a2b1d2fabacc24d0962821ad5ef01ddd63a985735953300acbdc38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(heros-otf.sty) \
texlive-heros-otf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(iftex.sty) \
tex(textcomp.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
