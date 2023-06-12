SUMMARY = "A set of sudoku-related packages"
DESCRIPTION = "The bundle provides three packages: printsudoku, which provides \
a command \\sudoku whose argument is the name of a file \
containing a puzzle specification; solvesudoku, which attempts \
to find a solution to the puzzle in the file named in the \
argument; and createsudoku, which uses the random package to \
generate a puzzle according to a bunch of parameters that the \
user sets via macros. The bundle comes with a set of \
ready-prepared puzzle files."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn15878"

RPM_NAME = "texlive-sudokubundle-2023.201.1.0asvn15878-57.1.noarch.rpm"
RPM_HASH = "c2c635200d1770b9bae6fa8360efc0c1d5af4ddaa94cbfed619189ed788898e440464c1c85b970325457edd0bced29cc69af3ad1d0801d2983f91713b820da47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(createsudoku.sty) \
tex(printsudoku.sty) \
tex(solvesudoku.sty) \
texlive-sudokubundle"
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
