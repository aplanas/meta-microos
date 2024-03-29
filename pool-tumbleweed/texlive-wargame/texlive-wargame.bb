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

PV = "2023.209.0.0.3.2svn64797"

RPM_NAME = "texlive-wargame-2023.209.0.0.3.2svn64797-54.1.noarch.rpm"
RPM_HASH = "3bb444b2618dd25bd20f5584f5848b3e4ecd9cb0e7f2cc2a6f77239f85d63d5a11a4ba6f6139e0b8bb01f2a1446678b13abcbc7469d311bb45d016b504b5be32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarywargame.chit.code.tex \
tex-tikzlibrarywargame.hex.code.tex \
tex-tikzlibrarywargame.natoapp6c.code.tex \
tex-tikzlibrarywargame.util.code.tex \
tex-wargame.sty \
tex-wgexport.cls \
texlive-wargame"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standalone.cls \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
