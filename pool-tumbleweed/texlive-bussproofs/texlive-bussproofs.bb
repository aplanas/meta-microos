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

PV = "2023.209.1.1svn54080"

RPM_NAME = "texlive-bussproofs-2023.209.1.1svn54080-53.1.noarch.rpm"
RPM_HASH = "fe71d98f8a7e2dd8f515a4a80cd7de0daecdbb1bfa6a9cbba50a7a402d4ac1f272e3acdca8c3b2840127ac3244d6c1d1587fbd36a8583c3c2c957f00e1b56a1c"
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
