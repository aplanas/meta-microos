SUMMARY = "Drawing ribbon proofs"
DESCRIPTION = "The package provides a way to draw 'ribbon proofs' in LaTeX. A \
ribbon proof is a diagrammatic representation of a mathematical \
proof that a computer program meets its specification. These \
diagrams are more human-readable, more scalable, and more \
easily modified than the corresponding textual proofs."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn31137"

RPM_NAME = "texlive-ribbonproofs-2023.209.1.0svn31137-54.1.noarch.rpm"
RPM_HASH = "87be878e7711a6ddec90180b1351c6e4459ae37ed25081b7000e756ddbf2c55ea94b17fad6873fa8b18144bc759a4d85de8222735be9f687d16582895c9b4dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ribbonproofs.sty \
texlive-ribbonproofs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etextools.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
