SUMMARY = "Create sudoku grids"
DESCRIPTION = "The sudoku package provides an environment for typesetting \
sudoku grids. A sudoku puzzle is a 9x9 grid where some of the \
squares in the grid contain numbers. The rules are simple: \
every column can only contain the digits 1 to 9, every row can \
only contain the digits 1 to 9 and every 3x3 box can only \
contain the digits 1 to 9. More information, including help and \
example puzzles, can be found at sudoku.org.uk. This site also \
has blank sudoku grids (or worksheets), but you will not need \
to print them from there if you have this package installed."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-sudoku-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "907f8915d34bd58359a62e165677a7e0af09f836bb0e9e3d042c5f5defa31b12ebf041d7d61ccd65285fed1ede3e055d0fac67c4485ed5edca27789bbb965748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(sudoku.sty) \
texlive-sudoku"

RDEPENDS:${PN} += "/bin/sh \
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
