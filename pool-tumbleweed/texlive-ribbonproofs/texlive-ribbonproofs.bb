SUMMARY = "Drawing ribbon proofs"
DESCRIPTION = "The package provides a way to draw 'ribbon proofs' in LaTeX. A \
ribbon proof is a diagrammatic representation of a mathematical \
proof that a computer program meets its specification. These \
diagrams are more human-readable, more scalable, and more \
easily modified than the corresponding textual proofs."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn31137"

RPM_NAME = "texlive-ribbonproofs-2023.201.1.0svn31137-53.1.noarch.rpm"
RPM_HASH = "b42ec5d0a1ff19dc86700bf2a2da956a37c91c6a02c683ad2cde25e3763c7c3d4664fe922237b8c5c59fb0d55f9784440e5f57267948f17e0e98b1747bb1426b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ribbonproofs.sty) \
texlive-ribbonproofs"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etextools.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
