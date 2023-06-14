SUMMARY = "Typeset flipbook animations, in the corners of documents"
DESCRIPTION = "The package provides techniques for adding flip book animations \
in the corner of your LaTeX documents (using images or ASCII \
art). Animations are defined as a set of numbered files (e.g., \
'im1.pdf', 'im2.pdf', 'im3.pdf', ...). The package relies on \
fancyhdr to control the corners."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn25584"

RPM_NAME = "texlive-flipbook-2023.201.0.0.2svn25584-52.1.noarch.rpm"
RPM_HASH = "9c24d7455e62d111058999f8b3d649ab2e75068ee29662a7fa95b4e82d220e31c10f0b00f0eb38fbaf80945c4d58e0c8c219a63e1961ffa887c780bb1c8dcd4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flipbook.sty \
texlive-flipbook"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-scalefnt.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
