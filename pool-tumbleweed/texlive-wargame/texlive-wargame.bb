SUMMARY = "A LaTeX package to prepare hex'n'counter wargames"
DESCRIPTION = "This package can help make classic Hex'n'Counter wargames using \
LaTeX. The package provide tools for generating Hex maps and \
boards Counters for units, markers, and so on Counter sheets \
Order of Battle charts Illustrations in the rules using the \
defined maps and counters The result will often be a PDF (or \
set of PDFs) that contain everything one will need for a game \
(rules, charts, boards, counter sheets). The package uses NATO \
App6 symbology for units. The package uses NATO App6 symbology \
for units. The package uses TikZ for most things. The package \
support exporting the game to a VASSAL module See also the \
README.md file for more, and of course the documentation \
(including the tutorial in tutorial/game.pdf)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.2svn64797"

RPM_NAME = "texlive-wargame-2023.201.0.0.3.2svn64797-53.1.noarch.rpm"
RPM_HASH = "f40f2d494e46ab9956128ce9e3289771dea3858e2bcb42df1409862b6ee93b318e006a945d0b5caf45c36dbdcf29597f937f69da6fbe49161033fc301ffd5007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzlibrarywargame.chit.code.tex) \
tex(tikzlibrarywargame.hex.code.tex) \
tex(tikzlibrarywargame.natoapp6c.code.tex) \
tex(tikzlibrarywargame.util.code.tex) \
tex(wargame.sty) \
tex(wgexport.cls) \
texlive-wargame"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
coreutils \
ed \
findutils \
grep \
sed \
tex(standalone.cls) \
tex(tikz.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
