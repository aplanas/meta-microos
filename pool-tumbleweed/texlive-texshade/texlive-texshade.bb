SUMMARY = "Package for setting nucleotide and peptide alignments"
DESCRIPTION = "TeXshade is alignment shading software completely written in \
TeX/LaTeX; it can process multiple sequence alignments in the \
.MSF and the .ALN file formats. In addition to common shading \
algorithms, it provides special shading modes showing \
functional aspects, e.g. charge or hydropathy, and a wide range \
of commands for handling shading colours, text styles, labels, \
legends; it even allows the user to define completely new \
shading modes. TeXshade combines highest flexibility with TeX \
output quality -- all in a bundle that does not demand \
excessive development time of the user."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.26asvn64242"

RPM_NAME = "texlive-texshade-2023.209.1.26asvn64242-55.1.noarch.rpm"
RPM_HASH = "607220229683ca586408c0bf34c71c8a49b6adab77e71bb63cf8f86ad28f8caecd3b53cacb5c0d2380af1e8670953dd801cad2281c75bdb4f47861f80467fe85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texshade.def \
tex-texshade.sty \
texlive-texshade"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-color.sty \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
