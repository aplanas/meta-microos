SUMMARY = "Drawing ribbon proofs"
DESCRIPTION = "The package provides a way to draw 'ribbon proofs' in LaTeX. A \
ribbon proof is a diagrammatic representation of a mathematical \
proof that a computer program meets its specification. These \
diagrams are more human-readable, more scalable, and more \
easily modified than the corresponding textual proofs."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn31137"

RPM_NAME = "texlive-ribbonproofs-2023.201.1.0svn31137-53.2.noarch.rpm"
RPM_HASH = "ef7f876cbd2cbaf92c50de28ba9e387294680c6a5db604966d1e8ce62595fe5d257165238944e085015f407a3f8cf0c62663ab875bebdbce7fc7737d0ec6c74f"
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
