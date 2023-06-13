SUMMARY = "Games typesetting"
DESCRIPTION = "Setups for typesetting various games, including chess."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65631"

RPM_NAME = "texlive-collection-games-2023.208.svn65631-58.1.noarch.rpm"
RPM_HASH = "b397cca8f34df7c3109f3c5c5a3caac36d55cb57065a3c6150050ccfbe6fa357945fa4123268b2925dcee7dc01c939b4ceac79e46548babbe6b2fefa4787683e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-games"

RDEPENDS:${PN} += "texlive-bartel-chess-fonts \
texlive-chess \
texlive-chess-problem-diagrams \
texlive-chessboard \
texlive-chessfss \
texlive-chinesechess \
texlive-collection-latex \
texlive-crossword \
texlive-crosswrd \
texlive-customdice \
texlive-egameps \
texlive-gamebook \
texlive-gamebooklib \
texlive-go \
texlive-hanoi \
texlive-havannah \
texlive-hexboard \
texlive-hexgame \
texlive-hmtrump \
texlive-horoscop \
texlive-jeuxcartes \
texlive-jigsaw \
texlive-labyrinth \
texlive-logicpuzzle \
texlive-mahjong \
texlive-maze \
texlive-musikui \
texlive-nimsticks \
texlive-onedown \
texlive-othello \
texlive-othelloboard \
texlive-pas-crosswords \
texlive-psgo \
texlive-realtranspose \
texlive-reverxii \
texlive-rubik \
texlive-schwalbe-chess \
texlive-scrabble \
texlive-sgame \
texlive-skak \
texlive-skaknew \
texlive-soup \
texlive-sudoku \
texlive-sudokubundle \
texlive-tangramtikz \
texlive-wargame \
texlive-xq \
texlive-xskak"

inherit rpm
