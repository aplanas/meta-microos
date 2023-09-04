SUMMARY = "Drawing ribbon proofs"
DESCRIPTION = "The package provides a way to draw 'ribbon proofs' in LaTeX. A \
ribbon proof is a diagrammatic representation of a mathematical \
proof that a computer program meets its specification. These \
diagrams are more human-readable, more scalable, and more \
easily modified than the corresponding textual proofs."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn31137"

RPM_NAME = "texlive-ribbonproofs-2023.209.1.0svn31137-54.2.noarch.rpm"
RPM_HASH = "d1714db9ddaff5ef3fbee0fc1d75368685b73924a55005f7039315f13dd432dbc4972f4619def69f852c40ad74fe6c5bec64c4f646837185c17d9acc9d82591a"
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
