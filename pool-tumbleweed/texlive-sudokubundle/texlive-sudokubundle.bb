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

PV = "2023.209.1.0asvn15878"

RPM_NAME = "texlive-sudokubundle-2023.209.1.0asvn15878-58.1.noarch.rpm"
RPM_HASH = "37bc75d53d3f0d97d61ffb0f6e9779e14b68a1e24ca070627ced06a77b1359beed81ecfb81507c5d44c13c100abe2d5c2be5eecf6a983cebb128dac5839d78f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-createsudoku.sty \
tex-printsudoku.sty \
tex-solvesudoku.sty \
texlive-sudokubundle"

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
