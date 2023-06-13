SUMMARY = "Using the OpenType fonts TeX Gyre Termes"
DESCRIPTION = "This package provides the OpenType version of the TeX Gyre \
Termes font, including text and math fonts. The package needs \
LuaLaTeX or XeLaTeX. The missing typefaces like bold math and \
slanted text are also defined."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn64733"

RPM_NAME = "texlive-termes-otf-2023.201.0.0.02svn64733-54.1.noarch.rpm"
RPM_HASH = "666f8c758d21c9a0da4dc865fe731e80e39460a7cdd21efe4586afef04fa651529c449a5b58afda023f2b6818cc267daa7a81cf2994bc935ec6fc705d963da8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(termes-otf.sty) \
texlive-termes-otf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(textcomp.sty) \
tex(unicode-math.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
