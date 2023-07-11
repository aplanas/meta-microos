SUMMARY = "Use TrueType and OpenType fonts in math mode"
DESCRIPTION = "The mathfont package adapts unicode text fonts for math mode. \
The package allows the user to specify a default unicode font \
for different classes of math symbols, and it provides tools to \
change the font locally for math alphabet characters. When \
typesetting with LuaTeX, mathfont adds resizable delimiters, \
big operators, and a MathConstants table to text fonts."
LICENSE = "LPPL-1.0"

PV = "2023.208.2.2asvn65205"

RPM_NAME = "texlive-mathfont-2023.208.2.2asvn65205-53.1.noarch.rpm"
RPM_HASH = "293bc40a3ce00e9d21ae47c77e9112024376eca31dc39553d27e45528591fbddae9972d9838002c04790fd84f7b7620b3c6ea56b4c702e127141afeaf5129db5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathfont.sty \
texlive-mathfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
