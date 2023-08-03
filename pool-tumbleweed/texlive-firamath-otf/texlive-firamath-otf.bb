SUMMARY = "Use OpenType math font Fira Math"
DESCRIPTION = "The package offers XeTeX/LuaTeX support for the Sans Serif \
OpenType Fira Math Font."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03asvn65561"

RPM_NAME = "texlive-firamath-otf-2023.209.0.0.03asvn65561-53.1.noarch.rpm"
RPM_HASH = "bee93730ef4449e453f31a368c9c784ac4f341206675ceb638cdc6fd6390d6f7ccc942129924d459891a96c5147f34dce471ae23b4bc141a38792c5595c8df48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-firamath-otf.sty \
texlive-firamath-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-xfakebold.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
