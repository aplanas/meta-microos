SUMMARY = "Fitch-style natural deduction proofs"
DESCRIPTION = "The package provides macros for typesetting natural deduction \
proofs in 'Fitch' style, with subproofs indented and offset by \
scope lines. The proofs from use of the package are in the \
format used in the textbook Language, Proof, and Logic by Dave \
Barker-Plummer, Jon Barwise, and John Etchemendy."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn31077"

RPM_NAME = "texlive-lplfitch-2023.201.0.0.9svn31077-54.1.noarch.rpm"
RPM_HASH = "ac4700ab8b8ae988e7b19c34320fe67b52dfce37a2a33da77dffa445553b2d4e4fba5462008e39df1c4c6c105feede19a9b337121830a8482a265fa5f4328be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lplfitch.sty \
texlive-lplfitch"

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
