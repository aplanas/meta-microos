SUMMARY = "Typeset crossword puzzles"
DESCRIPTION = "An extended grid-based puzzle package, designed to take all \
input (both grid and clues) from the same file. The package can \
typeset grids with holes in them (for advertisements, or other \
sorts of stuff), and can deal with several sorts of puzzle: The \
classical puzzle contains numbers for the words and clues for \
the words to be filled in. The numbered puzzle contains numbers \
in each cell where identical numbers represent identical \
letters. The goal is to find out which number corresponds to \
which letter. The fill-in type of puzzle consists of a grid and \
a list of words. The goal is to place all words in the grid. \
Sudoku and Kakuro puzzles involve filling in grids of numbers \
according to their own rules. Format may be block-separated, or \
separated by thick lines. Input to the package is somewhat \
redundant: specification of the grid is separate from \
specification of the clues (if they're necessary). The author \
considers this style both 'natural' and robust."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.11svn64375"

RPM_NAME = "texlive-crossword-2023.204.1.11svn64375-54.1.noarch.rpm"
RPM_HASH = "a54453925ad05503a1bd5e33955d79958ca09cbb639c8b3a829ece1d26a3c88d733f4d5d0a45fbb25b712184ccdfb50a1f42e036295af1bc85d289d353142897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cwpuzzle.sty \
texlive-crossword"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
