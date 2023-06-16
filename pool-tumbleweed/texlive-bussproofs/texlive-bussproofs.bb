SUMMARY = "Proof trees in the style of the sequent calculus"
DESCRIPTION = "The package allows the construction of proof trees in the style \
of the sequent calculus and many other proof systems. One novel \
feature of the macros is they support the horizontal alignment \
according to some centre point specified with the command \
\\fCenter. This is the style often used in sequent calculus \
proofs. The package works in a Plain TeX document, as well as \
in LaTeX; an exposition of the commands available is given in \
the package file itself."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54080"

RPM_NAME = "texlive-bussproofs-2023.201.1.1svn54080-52.1.noarch.rpm"
RPM_HASH = "ced5369bc56b709b155a254677a554adfe0caac7b94f46250abcf45d6f61d1036f4448acf88ed78fdc17bf1fa08c6662a2795ebfe854f1f766b766d8301c5131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bussproofs.sty \
texlive-bussproofs"

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
