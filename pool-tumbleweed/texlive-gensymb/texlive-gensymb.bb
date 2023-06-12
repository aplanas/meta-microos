SUMMARY = "Generic symbols for both text and math mode"
DESCRIPTION = "Provides generic commands \\degree, \\celsius, \\perthousand, \
\\micro and \\ohm which work both in text and maths mode. Various \
means are provided to fake the symbols or take them from \
particular symbol fonts, if they are not available in the \
default fonts used in the document. This should be perfectly \
transparent at user level, so that one can apply the same \
notation for units of measurement in text and math mode and \
with arbitrary typefaces. Note that the package has been \
designed to work in conjunction with units.sty. This package \
used to be part of the was bundle, but has now become a package \
in its own right."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn64740"

RPM_NAME = "texlive-gensymb-2023.201.1.0.2svn64740-52.1.noarch.rpm"
RPM_HASH = "dd9c1df24ba019bb746a97448fc21b926e619b2515d3c7db3b44829bbeb8bf2aa0497aa8072814e2577ffb254c192a899cc392f40214ee5ae1734792bc875894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gensymb.sty) \
texlive-gensymb"
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
