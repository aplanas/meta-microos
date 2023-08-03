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

PV = "2023.209.1.11svn64375"

RPM_NAME = "texlive-crossword-2023.209.1.11svn64375-55.1.noarch.rpm"
RPM_HASH = "14085514633fbc5188bd95bddfe0a7abaad1932b0223e85350ae9a66e2ffbb810b5ffb4f682586e1d1c86e7be387a4bd05056f464a80d887c2aef8f1213f926e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cwpuzzle.sty \
texlive-crossword"

RDEPENDS:${PN} += "/usr/bin/sh \
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
