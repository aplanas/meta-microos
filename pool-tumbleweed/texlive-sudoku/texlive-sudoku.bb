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

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-sudoku-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "896f1026b8e2fa07e610055b4c973f85f5ff226ce78629c9f84f817a024625dacfd0d0ff16698594db3d0d652ecf2bd3f28830420743de7291dd38aab37881f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sudoku.sty \
texlive-sudoku"

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
