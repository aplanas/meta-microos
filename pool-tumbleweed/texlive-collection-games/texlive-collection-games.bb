SUMMARY = "Games typesetting"
DESCRIPTION = "Setups for typesetting various games, including chess."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65631"

RPM_NAME = "texlive-collection-games-2023.208.svn65631-60.1.noarch.rpm"
RPM_HASH = "4801b4b0c2b943a11501dda04aba167a0a12d7241c66abe8a689c3c5cf070e28fc6ecf15cf6915c99c8ea678c4c98d00f1a6afe2e8e24ea709fd2e8d386bd71d"
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
