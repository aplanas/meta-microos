SUMMARY = "Fitch-style natural deduction proofs"
DESCRIPTION = "The package provides macros for typesetting natural deduction \
proofs in 'Fitch' style, with subproofs indented and offset by \
scope lines. The proofs from use of the package are in the \
format used in the textbook Language, Proof, and Logic by Dave \
Barker-Plummer, Jon Barwise, and John Etchemendy."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn31077"

RPM_NAME = "texlive-lplfitch-2023.209.0.0.9svn31077-55.1.noarch.rpm"
RPM_HASH = "2e0b862402f9822f9c025345fbbe1993c2b017404f309b2101256db4c65c3b9931fee2f94c3081ea23228401ca37c32fa74267259542556600c07b6a98d947dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lplfitch.sty \
texlive-lplfitch"

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
